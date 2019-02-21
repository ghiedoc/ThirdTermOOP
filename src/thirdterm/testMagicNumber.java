/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdterm;

import java.util.ArrayList;

/**
 *
 * @author Gillian
 */
public class testMagicNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Balls> arr = new ArrayList<>();

        arr.add(new Balls(4));
        arr.add(new Balls(1));
        arr.add(new Balls(3));
        arr.add(new Balls(5));
        arr.add(new Balls(2));

        //sorting
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                if (arr.get(j).Magicnumber > arr.get(i).Magicnumber) {
                    Balls objX = arr.get(i);
                    Balls objY = arr.get(j);
                    arr.set(i, objY);
                    arr.set(j, objX);
                }

            }
        }
        //display
        for(int i = 0; i < arr.size(); i++){
            arr.get(i).PrintNumber();
        }
    }

}
