
package labproject;

import java.util.Scanner;

public class BurgerSadawitch {
    //atributes
   private String name;
   private String TypeOfMeet;
   private String TypeOfBread;
   private boolean ExtraCheese;
   private boolean ExtraTomato;
   private boolean WithChips;
   private boolean WithDrink;
   private static final int FristPrise=50;

 //constractor 
 

    public BurgerSadawitch() {
    }
  //setter and getter

    public String getTypeOfMeet() {
        return TypeOfMeet;
    }

    public void setTypeOfMeet(String TypeOfMeet) {
        this.TypeOfMeet = TypeOfMeet;
    }

    public String getTypeOfBread() {
        return TypeOfBread;
    }

    public void setTypeOfBread(String TypeOfBread) {
        this.TypeOfBread = TypeOfBread;
    }

    public boolean isExtraCheese() {
        return ExtraCheese;
    }

    public void setExtraCheese(boolean ExtraCheese) {
        this.ExtraCheese = ExtraCheese;
    }

    public boolean isExtraTomato() {
        return ExtraTomato;
    }

    public void setExtraTomato(boolean ExtraTomato) {
        this.ExtraTomato = ExtraTomato;
    }

    public boolean isWithChips() {
        return WithChips;
    }

    public void setWithChips(boolean WithChips) {
        this.WithChips = WithChips;
    }

    public boolean isWithDrink() {
        return WithDrink;
    }

    public void setWithDrink(boolean WithDrink) {
        this.WithDrink = WithDrink;
    }

   
    //Price Method


   public static void BurgerSandawitchdata(){
             BurgerSadawitch x= new BurgerSadawitch();
         Scanner cs = new Scanner(System.in); 


     System.out.println("chicken or beef??");
           x.setTypeOfMeet(cs.nextLine());
           System.out.println("white bread or brown bread??");
           x.setTypeOfBread(cs.nextLine());
            System.out.println("u wanna extra addishion??");
            String AddAnawer=cs.nextLine();
            if(AddAnawer.equalsIgnoreCase("yes")){
                System.out.println("what do u prefere??"+'\n'+"1- extra cheese"+'\n'+"2 - extra tomato"+'\n'+"3 - Drink?"+'\n'+"4 - Chips?"+'\n'+"u can choose mare than one "); 
                String addichions = cs.nextLine();
                if(addichions.contains("1")){
                    x.setExtraCheese(true);
                } if(addichions.contains("2")){
                    x.setExtraTomato(true);
                } if (addichions.contains("3")){
                    x.setWithDrink(true);
                }if (addichions.contains("4")){
                    x.setWithChips(true);
                }}System.out.println("your total prise is  "+x.Price(x.isExtraCheese(), x.isExtraTomato(), x.isWithChips(), x.isWithDrink()));
} 
       public static double Price( boolean ExtraCheese,boolean ExtraTomat, boolean WithChips,boolean WithDrink){
        int PriseOfCheese=5;
        int priseOfTomato=3;
        int priseOfChips=4;
        int priceOfDrink=6;
        double TotalPrise=FristPrise;
        if(ExtraCheese){
         TotalPrise += PriseOfCheese;
        }if(ExtraTomat){
           TotalPrise += priseOfTomato;
        }if(WithChips){
           TotalPrise += priseOfChips;
        }if(WithDrink){
            TotalPrise  +=priceOfDrink ;
        }
        return TotalPrise;
    }
}
