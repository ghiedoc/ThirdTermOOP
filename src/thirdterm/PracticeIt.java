package thirdterm;

import java.util.ArrayList;

public class PracticeIt {

    /**
     * maxLength returns the length of the longest string in the list. If your
     * method is passed an empty list, it should return 0.
     */
    public static int maxLength(ArrayList<String> arr) {
        int longest = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > longest) {
                longest = arr.get(i).length();
            }
        }
        System.out.println("longest: " + longest);

        return longest;
    }

    /**
     * doubleList Write a method doubleList that takes an ArrayList of Strings
     * as a parameter and that replaces every string with two of that string.
     * For example, if the list stores the values {"how", "are", "you?"} before
     * the method is called, it should store the values {"how", "how", "are",
     * "are", "you?", "you?"} after the method finishes executing.
     *
     * @param args
     */
    public static void doubleList(ArrayList<String> arr) {
        int oldSize = arr.size();
        for (int i = 0; i < oldSize; i++) {
            String word = arr.get(2 * i);
            arr.add(2 * i + 1, word);
        }
        System.out.println(arr);

    }

    public static void getMin(ArrayList<Integer> arr) {
        int min = 0;
        int biggest = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > biggest) {
                biggest = arr.get(i);
            }
            if(arr.get(i) < biggest){
                min = arr.get(i);
            }
            //min = arr.get(i);
        }
        System.out.println("biggest: " + biggest);
        System.out.println("minimum: " + min);
        System.out.println(arr);
        //System.out.println(biggest);
        //System.out.println(arr);
    }

    public static void main(String[] args) {
        PracticeIt template = new PracticeIt();
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Doki");
        arr.add("abababab");
        arr.add("Gilly");
        arr.add("aaaaaaaaa");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(9);
        

        //template.maxLength(arr);
        //doubleList(arr);
        getMin(nums);
    }

}
