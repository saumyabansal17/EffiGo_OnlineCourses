import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        
      
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How many pizza toppings do you want?");
        int numToppings = scan.nextInt(); 
        scan.nextLine(); 
        System.out.println("Great, enter each topping!");
        
        String[] toppings = new String[numToppings]; 
        for(int i=0;i<numToppings;i++){
            System.out.print(i+". ");
            toppings[i]=scan.nextLine();
        }
        
        System.out.println("\nThank you! Here are the toppings you ordered");
        
        for(int i=0;i<numToppings;i++){
            System.out.println(i+". "+toppings[i]);
        }
        
        System.out.println("\nPress anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");

        scan.close();


         
    }
}
