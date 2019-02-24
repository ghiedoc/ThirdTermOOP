/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdterm;

/**
 *
 * @author Gillian
 */
public class MyPoint {
    private int x = 0;
    private int y = 0;
    
    MyPoint(){
        
    }
    
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX() {
        System.out.println("getX: " + x);
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        System.out.println("getY: " + y);
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public int[] getXY(){
        int[] arr = {x, y};
        
        System.out.println("getXY: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        
        return arr;
    }
    
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public String toString(){
        
        String print = "(" + x + "," + y + ")";
        System.out.println("toString: " + print);
        
        return print;
        
    }
    
    public double distance(int x, int y){
        
        
        
        return 0;
        
    }
    
    public double distance(MyPoint another){
        return 0;
        
    }
    
    public double distance(){
        return 0;
        
    }
    
    public static void main (String[] args){
        MyPoint mp = new MyPoint(5, 9);
        mp.getX();
        mp.getY();
        mp.getXY();
        mp.toString();
    }
    
    
    
}
