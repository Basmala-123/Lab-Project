
package labproject;

import java.util.Scanner;


public class LabProject {

    public static void main(String[] args) {
        int order= welcome();
       if(order==1){
          BurgerSadawitch x= new BurgerSadawitch();

          x.BurgerSandawitchdata();
            }else if(order==2){
            HealthyBurger x= new HealthyBurger();
               x. BurgerSandawitchdata();
            }else{
              DeluxBurger x= new DeluxBurger();
                x.BurgerSandawitchdata();
            }
    
    
    
    
     
       
    
    }
       
    
    

public static int welcome( ){
          Scanner sc = new Scanner(System.in);  
    System.out.println("welcome at our resturant"+'\n'+"please enter your order");
    System.out.println("1 - burger sandwich"+'\n'+"2 - Healthy Burger"+'\n'+"3 - Delux Burger");
  int  choice = sc.nextInt() ;
  return choice;
}




}