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
public class ScentedCandle extends Candle {
    
    String scent;

    public String getScent() {
        System.out.println("Scent: " + scent);
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }

    @Override
    public void setHeight(double height) {
        price = 3.0 * height;
        this.height = height;
    }
    
    
    
}
