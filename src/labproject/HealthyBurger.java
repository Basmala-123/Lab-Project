
package labproject;

import java.util.Scanner;

public class HealthyBurger extends BurgerSadawitch{
    private final String TypeOfBread="brown";
    private final  boolean WithChips=false;
    private final boolean  WithCoCaCola=false;
public static void BurgerSandawitchdata(){
             HealthyBurger x= new HealthyBurger();
         Scanner cs = new Scanner(System.in); 


     System.out.println("chicken or beef??");
           x.setTypeOfMeet(cs.nextLine());
            System.out.println("u wanna extra addishion??");
            String AddAnawer=cs.nextLine();
            if(AddAnawer.equalsIgnoreCase("yes")){
                System.out.println("what do u prefere??"+'\n'+"1- extra cheese"+'\n'+"2 - extra tomato"+'\n'+"u can just choose 2 addirtion "); 
                String addichions = cs.nextLine();
               
                if(addichions.contains("1")){
                    x.setExtraCheese(true);
                    
                } if(addichions.contains("2")){
                    x.setExtraTomato(true);
                   
                
}
                }System.out.println("your total prise is  "+x.Price(x.isExtraCheese(), x.isExtraTomato(), x.isWithChips(), x.isWithDrink()));
}
    
}
