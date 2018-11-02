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
public class Crust extends Pizza{
    
    //variables
    private String crustChoice;
    private boolean redSauce;
    private String sauceAmount;
    
    //no-arg constructor
   public Crust(){
       super();
       this.redSauce = false;
       this.sauceAmount = "0 cups";
   }
   //overloaded constructor
   public Crust(boolean rdSce, String sceAm){
       super();
       this.redSauce = rdSce;
       this.sauceAmount = sceAm;
       
   }
   


    /**
     * @return the crustChoices
     */
    public String getCrustChoice() {
        return crustChoice;
    }

    /**
     * @param crustChoices the crustChoices to set
     */
    public void setCrustChoice(String crustChoices) {
        this.crustChoice = crustChoices;
    }

    /**
     * @return the redSauce
     */
    public boolean isRedSauce() {
        return redSauce;
    }

    /**
     * @param redSauce the redSauce to set
     */
    public void setRedSauce(boolean redSauce) {
        this.redSauce = redSauce;
    }

    /**
     * @return the sauceAmount
     */
    public String getSauceAmount() {
        return sauceAmount;
    }

    /**
     * @param sauceAmount the sauceAmount to set
     */
    public void setSauceAmount (String sauceAmount) {
        this.sauceAmount = sauceAmount;
    }
    
       //toString method
    public String toString(){
       String stringToPrint = "";
       if (isRedSauce()){
           stringToPrint += "Please add red sauce\n"+
           "Sauce Amount: " + getSauceAmount()+ "\n";
       }
       stringToPrint +=
               
               "Crust Choice: " + getCrustChoice();
               
       return stringToPrint;
               
   }
    
}
