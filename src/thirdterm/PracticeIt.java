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
            if (arr.get(i) < biggest) {
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

    /*
    Array Exercises
    BJP4 Exercise 7.1: lastIndexOf
    Write a method named lastIndexOf that accepts an array of
    integers and an integer value as its parameters and returns
    the last index at which the value occurs in the array.
    The method should return -1 if the value is not found.
    For example, in the list containing {74, 85, 102, 99, 101, 85, 56},
    the last index of the value 85 is 5.
     */
    public void lasIndexOf(int[] arr, int x) {
        int find = x;
        int notFound = -1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] == find) {
                System.out.println(arr[i]);
            }

        }

        System.out.println(notFound);
    }

    public void range(int[] arr) {
        
        int largest = 0;
        int smallest = 0;
        int temp = 0;

        //find the largest in an array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        //System.out.println(largest);

        //find the smallest
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    smallest = arr[j];
                }
            }
        }
        //System.out.println(smallest);
        
        //formula for range
        int range = largest - smallest;
        System.out.println(range);

    }
    
    public void countInRange(int[] arr, int min, int max){
        int count = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(min <= arr[i] && max >= arr[i]){
                count++;
            }
        }
        System.out.println("count: " + count);
    }
    
    public void minToFront(ArrayList<Integer> arr){
        int smallest = 0;
        
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(j) < arr.get(i)){
                    smallest = arr.get(j);
                }
            }
        }
        arr.add(0, smallest);
        
        //print
        for(int x: arr){
            System.out.println(x);
        }
    }
    
    public void removeDuplicates(ArrayList<String> arr){
        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(arr.get(j).equals(arr.get(i))){
                    arr.remove(arr.get(j));
                }
            }
        }
        //print
        for(String x: arr){
            System.out.println(x);
        }
    }
    
    public void removeInRange(ArrayList<Integer> arr, int x, int start, int end){
        for(int i = 0; i < arr.size(); i++){
            if(start >= arr.get(i) && end <= arr.get(i)){
                if(arr.get(i).equals(x)){
                    arr.remove(arr.get(i));
                }
            }
        }
        
        //print
        for(int y : arr){
            System.out.println(y);
        }
    }
    
    public boolean isPalindrome(String str){
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(0) == str.charAt(str.length()-1)){
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        PracticeIt template = new PracticeIt();
//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("Doki");
//        arr.add("abababab");
//        arr.add("Gilly");
//        arr.add("aaaaaaaaa");
//        ArrayList<Integer> nums = new ArrayList<>();
//        nums.add(2);
//        nums.add(3);
//        nums.add(1);
//        nums.add(9);
//        
//
//        //template.maxLength(arr);
//        //doubleList(arr);
//        getMin(nums);

        //int array[] = {14, 1, 22, 17, 36, 7, 5};
        //template.range(array);
        //template.countInRange(array, 4, 17);
        
//        ArrayList<Integer> array = new ArrayList<>();
//        array.add(3);
//        array.add(8);
//        array.add(92);
//        array.add(4);
//        array.add(2);
//        array.add(17);
//        array.add(9);
//        
//        template.minToFront(array);

//        ArrayList<String> arr = new ArrayList<>();
//        arr.add("be");
//        arr.add("be");
//        arr.add("is");
//        arr.add("not");
//        arr.add("or");
//        arr.add("question");
//        arr.add("that");
//        arr.add("the");
//        arr.add("to");
//        arr.add("to");
//        
//        template.removeDuplicates(arr);
        
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(0);
//        arr.add(0);
//        arr.add(2);
//        arr.add(0);
//        arr.add(4);
//        arr.add(0);
//        arr.add(6);
//        arr.add(0);
//        arr.add(8);
//        arr.add(0);
//        arr.add(10);
//        arr.add(0);
//        arr.add(12);
//        arr.add(0);
//        arr.add(14);
//        arr.add(0);
//        arr.add(16);
//        template.removeInRange(arr, 0, 5, 13);
        
        String hey = "madam";
        template.isPalindrome(hey);
    }

}
