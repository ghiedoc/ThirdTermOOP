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
public class Candle {
    
    protected String color;
    protected double height;
    protected double price;

    public String getColor() {
        System.out.println("Color: " + color);
        return color;
    }

    public double getHeight() {
        System.out.println("Height: " + height);
        return height;
    }

    public double getPrice() {
        System.out.println("Price = " + price);
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        price = 2.0 * height;
        this.height = height;
    }
    
    public static void main (String[] args){
        Candle c = new Candle();
        ScentedCandle sc = new ScentedCandle();
        
        c.setColor("Green");
        c.setHeight(5);
        c.getColor();
        c.getHeight();
        c.getPrice();
        sc.setHeight(5);
        sc.setScent("Roses");
        sc.getPrice();
    }
    
    
    
}
