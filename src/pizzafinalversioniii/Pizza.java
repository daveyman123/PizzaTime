/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzafinalversioniii;

/**
 *
 * @author Bob
 */
public class Pizza {
    
    //variables
   
    private int maxToppings;
    
    //no args constructor
    public Pizza(){
   
        this.maxToppings = 7;
    }

    /**
     * @return the maxToppings
     */
    public int getMaxToppings() {
        return maxToppings;
    }

    /**
     * @param maxToppings the maxToppings to set
     */
    public void setMaxToppings(int maxToppings) {
        this.maxToppings += maxToppings;
    }
    
    public void setMaxToppingsValue(int maxToppingsValue){
        this.maxToppings = maxToppingsValue;
    }
    public int getMaxToppingsValue(){
        return maxToppings;
    }
    /**
     * @return the pizzaCount
     */

    
  
    
    
}
