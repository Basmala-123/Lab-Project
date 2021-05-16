
package labproject;

import java.util.Scanner;


public class DeluxBurger extends BurgerSadawitch{
        private final String TypeOfBread="white bread";
        private final String TypeOfMeet="beef";
        private final boolean ExtraCheese=false;
        private final boolean ExtraTomato=false;
        public static void BurgerSandawitchdata(){
             DeluxBurger x= new DeluxBurger();
            Scanner cs = new Scanner(System.in); 
            System.out.println("u wanna extra addishion??");
            String AddAnawer=cs.nextLine();
            if(AddAnawer.equalsIgnoreCase("yes")){
                System.out.println("what do u prefere??"+'\n'+"1 - Drink"+'\n'+"2 - Chips"+'\n'); 
                String addichions = cs.nextLine();
               
                if(addichions.contains("1")){
                    x.setWithDrink(true);
                    
                } if(addichions.contains("2")){
                    x.setWithChips(true);
                } 
                }System.out.println("your total prise is  "+x.Price(x.isExtraCheese(), x.isExtraTomato(), x.isWithChips(), x.isWithDrink()));
}


    
}
