package thirdterm;

import java.util.ArrayList;

/**
 *
 * @author Gillian
 */
public class ArrayLinkList {

    public static void removeEven(ArrayList<String> arr){
        
        
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i).length() % 2 == 0){
                arr.remove(i);
            }
        }
        System.out.println("remaining: " + arr);
        

    }
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<String>();
        aList.add("this");
        aList.add("is");
        aList.add("lots");
        aList.add("of");
        aList.add("fun");
        aList.add("for");
        aList.add("every");
        aList.add("Java");
        aList.add("Programmer");
        removeEven(aList);
        
    }
    
}
