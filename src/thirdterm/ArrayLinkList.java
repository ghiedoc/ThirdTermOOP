package thirdterm;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Gillian
 */
public class ArrayLinkList {

    public static void reverseSwap(ArrayList<String> inner) {

        for (int x = 0; x < inner.size() - 1; x += 2) {
            for (int y = 1; y <= inner.size() - 1; y += 2) {
                String temp_1 = inner.get(x);
                String temp_2 = inner.get(y);
                inner.set(x, temp_2);
                inner.set(y, temp_1);
            }
        }
        System.out.println(inner);

    }

    public static void wordSwap(ArrayList<String> swap) {
        int x = 0;
        int y = 1;

        while (x < swap.size() - 1 || y <= swap.size() - 1) {
            String temp_1 = swap.get(x);
            String temp_2 = swap.get(y);

            swap.set(x, temp_2);
            swap.set(y, temp_1);
            x += 2;
            y += 2;
        }
        System.out.println(swap);
    }

    public static void replace4(LinkedList<String> arr) {
        String ask = "****";

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() == ask.length()) {
                arr.add(i, ask);
            }
            i++;
        }
        System.out.println("reamining: " + arr);
    }

    public static void removeEven(ArrayList<String> arr) {

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() % 2 == 0) {
                arr.remove(i);
            }
        }
        System.out.println("remaining: " + arr);

    }

    public static void insertFirst(ArrayList<String> first) {

        
        first.remove(first.get(2));
        
        System.out.println(first);

    }

    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        ArrayList<String> bList = new ArrayList<String>();

        aList.add("this");
        aList.add("is");
        aList.add("lots");
        aList.add("of");
        aList.add("fun");
        aList.add("for");
        aList.add("every");
        aList.add("Java");
        aList.add("Programmer");
        //removeEven(aList);
        //replace4(aList);
        bList.add("four");
        bList.add("score");
        bList.add("and");
        bList.add("seven");
        bList.add("years");
        bList.add("ago");
        //bList.add("four");
        //wordSwap(aList);
        //reverseSwap(bList);
        insertFirst(bList);
    }

}
