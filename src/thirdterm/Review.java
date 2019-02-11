package thirdterm;

//Recursion

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;

public class Review {

    public int convert(int n) {

        if (n <= 0) {
            return 0;
        }

        return n % 2 + 10 * convert(n / 2);

    }

    public static void permutation(String a, String s) {
        
        if (s.length() == 0) {
            System.out.println(a);
        } else {
            for (int i = 0; i < s.length(); i++) {
                permutation(a + s.charAt(i), s.substring(0, i) + s.substring(1 + i, s.length()));
            }
        }
    }

    public static void recurPermute(String str, String x) {

        int n = str.length();

        if (n == 0) {
            System.out.println(str);
        } else {
            if (n > 0) {
                recurPermute(str + str.charAt(n), x.substring(0, n) + x.substring(n + 1, n));
            }
        }

    }

    public String permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        }
        
        str = change(str, l, r);
        return permute(str, l + 1, r);

    }

    public String change(String a, int first, int second) {
        char temp;
        char[] array_a = a.toCharArray();
        temp = array_a[first];
        array_a[first] = array_a[second];
        array_a[second] = temp;
        //System.out.println(String.valueOf(array_a));
        return String.valueOf(array_a);
    }
    
    public int totalUnique(String filePath){
        
        //The dog barks The cat meow meow cat dog
        HashSet<String> setList = new HashSet<>();
        try {
            BufferedReader read = new BufferedReader(new FileReader(filePath));
            String line = null;
            while ((line = read.readLine()) != null) {

                String[] wordArray = line.split(" ");
                
                for (int index = 0; index < wordArray.length; index++) {
                    setList.add(wordArray[index]);
                }
            }

        } catch (Exception e) {
        }


        return setList.size();
        
    }
    
    /**
     * TO-DO code here the logic that checks if the specified element exists in
     * the given array or not.
     *
     * @param list the list of string from user.
     * @param find the element that will be search from the list
     *
     * @return True if the element exists, otherwise false.
     *
     */
    public static boolean isInsideElement(String[] list, String find) {
        
        for(int i = 0; i < list.length; i++){
            if(find.equals(list[i])){
                String found = list[i];
                System.out.println(found);
                return true;
            }
        }
        System.out.println();
        
        return false;
    }
    
    /**
     * TO-DO code here the logic that displays all the unique words in the list
     * and its corresponding frequency.
     *
     * @param list the list of string from user.
     */
    public void displayUniqueWithFrequency(String[] list) {

        
        
    }

    public static void main(String[] args) {
        Review r = new Review();
        //r.sample("AAB", 2, 1);
        //System.out.println(r.convert(4));
        //System.out.println(r.permute("AAB", 0, 0));
        //System.out.println(r.recurPermute("AAB", "A"));
        //r.recurPermute("AAB", "A");
        //permutation("", "ABA");
        String[] arr = {"dog", "cat", "rabbit"};
        System.out.println(r.isInsideElement(arr, "aso"));
        
        System.out.println(r.totalUnique("C:\\Users\\Gillian\\Documents\\NetBeansProjects\\OOP-master\\src\\test\\files\\TestThree.txt"));
    }
}
