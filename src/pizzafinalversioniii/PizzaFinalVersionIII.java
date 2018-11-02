
package pizzafinalversioniii;

/**
 *
 * 
 */

import java.util.Scanner;

public class PizzaFinalVersionIII{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        String crustChoice=null;
        String sauceChoice=null;
        String sauceAmount=null;
        String toppingChoice=null;
        String toppingAmount=null;
        String continueOrNot=null;
        int k;
        int toppingPosition;
        boolean toppingPositionStop = false;
        boolean chosen = false;
        
        //crust part
        AsteriskLine();
        System.out.print("Please choose one crust option:");
        System.out.println("a. regular crust      b. gluten-free crust");
        while(chosen == false)
        {
        System.out.print("Enter choice: ");
        crustChoice=input.next();
        if (crustChoice.equalsIgnoreCase("a"))
        {
            crustChoice="regular crust";
            System.out.println("* You chose: a. regular crust = 1 *");
            chosen = true;
        }
        else if (crustChoice.equalsIgnoreCase("b"))
        {
            crustChoice="gluten-free crust";
            System.out.println("* You chose: b. gluten-free crust = 1 *");
            chosen = true;
        }
        if(chosen == false)
        {
            if (chosen == false)
            {
            System.out.println("Please choose a valid option");
            }
        }
        }
        chosen = false;
        AsteriskLine();
    

        //sauce part
        System.out.println("Please choose one sauce option:");
        System.out.println("a. red sauce      b. no red sauce");
        while(chosen == false)
        {
        System.out.print("Enter choice: ");
        sauceChoice=input.next();
        if (sauceChoice.equalsIgnoreCase("a"))
        {
            sauceChoice="red sauce";
            System.out.println("Please choose one amount: ");
            System.out.println("a. 1/4 cup      b. 1/2 cup");
            while(chosen == false)
            {
            System.out.print("Enter choice: ");
            sauceAmount=input.next();
            if (sauceAmount.equalsIgnoreCase("a"))
            {
                sauceAmount="1/4 cup";
                System.out.println("* You chose: a. red sauce = 1/4 cup *");
                chosen = true;
            }
            if (sauceAmount.equalsIgnoreCase("b"))
            {
                sauceAmount="1/2 cup";
                System.out.println("* You chose: a. red sauce = 1/2 cup *");
                chosen = true;
            }
            if(chosen == false)
            {
                if(chosen == false)
                {
                    System.out.println("Please choose a valid option");
                }
            }
            }
        }
        else if (sauceChoice.equalsIgnoreCase("b"))
        {
            sauceChoice="no red sauce";
            sauceAmount="";
            System.out.println("* You chose: b. no red sauce *");
            chosen = true;
        }
        if(chosen == false)
        {
            if (chosen == false)
            {
                System.out.println("Please choose a valid option");
            }
        }
        }
        AsteriskLine();
        chosen = false;
    

        // the hard part about the topping(ingredients from a.pizza chesse to l. dry basil
        String[][] toppings = {
            {"a. pizza cheese", "a. 1/4 cup", "b. 1/2 cup","", ""},
            {"b. diced onion", "a, 1/8 cup", "b. 1/4 cup","", ""},
            {"c. diced green pepper", "a. 1/8 cup", "b. 1/4 cup","",""},
            {"d. pepperoni", "a. 2 pieces", "b. 4 pieces", "c. 6 pieces", "d. 8 pieces"},
            {"e. sliced mushroom", "a. 1/8 cup", "b. 1/4 cup","",""},
            {"f. diced jalapenos", "a. 1/8 cup", "b. 1/4 cup","", ""},
            {"g. sardines", "a. 1", "b. 2", "c. 3", "d. 4"},
            {"h. pineapple chunks", "a. 2 pieces", "b. 4 pieces", "c. 6 pieces", "d. 8 pieces"},
            {"i. tofu", "a. 1/4 cup", "b. 1/2 cup","",""},
            {"j.ham chunks", "a. 4 pieces", "b. 8 pieces", "c. 12 pieces", "d. 16 pieces"},
            {"k. dry red pepper", "a. 1 generous sprinkle","b. 2 generous sprinkles","c. 3 generous sprinkles","d. 4 generous sprinkles"},
            {"l. dry basil", "a. 1 generous sprinkle","b. 2 generous sprinkles","",""}
        };
        
        String[][] selectedToppings = new String[6][2]; //Actually, if no red sauce, customer allow choose 7 items
        int toppingCount=0;
        do {
            toppingPosition = 0;
            System.out.println("Please choose one ingredient option:");
            int col=0;
            for (int row=0; row<12 - toppingCount; row++){
                System.out.println(toppings[row][col]);
            }
            while (chosen == false)
            {
            toppingPosition = 0;
            System.out.print("Enter choice:");
            toppingChoice=input.next();
            for (int row=0; row<12 - toppingCount; row++)
            {
                if(toppingPositionStop == false)
                {
                    if(toppingPositionStop == false)
                    {
                        toppingPosition += 1;
                    }
                }
                col=0;
                if (toppingChoice.charAt(0)==toppings[row][col].charAt(0))
                {
                    toppingPositionStop = true;
                    System.out.println("Please choose one amount:");
                    selectedToppings[toppingCount][0]=toppings[row][col];
                    for (col=1; col<=4;col++)
                    {
                        System.out.println(toppings[row][col]);
                    }
                    while(chosen == false)
                    {
                    System.out.print("Enter choice:");
                    toppingAmount=input.next();
                    if (toppingAmount.equalsIgnoreCase("a") || toppingAmount.equalsIgnoreCase("b") ||
                            toppingAmount.equalsIgnoreCase("c") || toppingAmount.equalsIgnoreCase("d")
                            )
                    {
                        String amount=toppings[row][toppingAmount.charAt(0)-'a'+1].substring(2);
                        System.out.println ("You chose: "+toppings[row][0]+" = "+amount);    
                        selectedToppings[toppingCount][1]=amount;
                        toppingCount++;
                        chosen = true;
                    }// toppingAmount.charAt(0) means a or b or c or d, char can minus char, so we can get the col 1, 2, 3, 4;
                    if(chosen == false)
                    {
                        if (chosen == false)
                        {
                            System.out.println("Please choose a valid option");
                        }
                    }
                    }
                }
            }
            if(chosen == false)
            {
                if (chosen == false)
                {
                    System.out.println("Please choose a valid option");
                }
            }
            }
            toppingPositionStop = false;
            chosen = false;
            for(k = toppingPosition-1; k<11; k++) //Changes our topping list and won't allow users to choose same topping twice. The -1 is a bit clunky, but I couldn't see a better spot to guess at the position.
            {
                for(col=0; col<=4; col++)
                {
				toppings[k][col] = toppings[k+1][col];
                }
            }
            AsteriskLine();
            System.out.println("Would you like to add another ingredient? ");
            System.out.println("a. continue       b. finished");
            while (chosen == false)
            {
            System.out.print("Enter choice:");
            continueOrNot=input.next();
            if(continueOrNot.charAt(0)=='b')
            { 
                // To be printed
                System.out.println("* Your pizza recipe *");
                System.out.println(crustChoice+"    "+"1");
//                System.out.println("1");
                System.out.println(sauceChoice+"    "+sauceAmount);
//                System.out.println(sauceAmount);
                for(int ii=0; ii<toppingCount;ii++)
                {
                    System.out.println(selectedToppings[ii][0].substring(2)+"    "+ selectedToppings[ii][1]);
                }
                System.out.println("* Pizza is to be appropriately cooked until crust is cooked and toppings are warmed *");
                System.exit(0);
            }
            if(continueOrNot.charAt(0)=='a')
            {
                chosen = true;
            }
            if(chosen == false)
            {
                if (chosen == false)
                {
                    System.out.println("Please choose a valid option");
                }
            }
            }
            chosen = false;
        } while(toppingCount < 6) ;  
        System.out.println("You have reached the max amount of toppings.");
        AsteriskLine();
        System.out.println("* Your pizza recipe *");
                System.out.println(crustChoice+"    "+"1");
//                System.out.println("1");
                System.out.println(sauceChoice+"    "+sauceAmount);
//                System.out.println(sauceAmount);
                for(int ii=0; ii<toppingCount;ii++)
                {
                    System.out.println(selectedToppings[ii][0].substring(2)+"    "+ selectedToppings[ii][1]);
                }
                System.out.println("* Pizza is to be appropriately cooked until crust is cooked and toppings are warmed *");
                System.exit(0);
    }
    public static void AsteriskLine()
    {
        System.out.println("******************************************");
    }
}/* To do:
11. a lot of hard coding, need to creat some methods;
22. too much if, if, consider to use some loops;
33. the topping list needs to change dynamically;
44. to edit print format 
*/