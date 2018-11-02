/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzafinalversioniii;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Bob
 */
public class Toppings extends Pizza{
    
    //array to store toppings
    
    //determine whether toppings are full pizza or half

    private Map<String, String> toppings;
    
    
    public Toppings(){
        super();
        toppings  = new HashMap<String, String>();
    }
    
    public Toppings(Map<String, String> toppings){
        super();
        this.toppings = toppings;
    }

    /**
     * @return the toppings
     */
    public Map<String, String> getToppings() {
        return toppings;
    }

    /**
     * @param toppings the toppings to set
     */
    public void setToppings(Map<String, String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public void setMaxToppings(int maxToppings) {
        super.setMaxToppings(maxToppings); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxToppings() {
        return super.getMaxToppings(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaxToppingsValue(int maxToppingsValue) {
        super.setMaxToppingsValue(maxToppingsValue); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getMaxToppingsValue() {
        return super.getMaxToppingsValue(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
