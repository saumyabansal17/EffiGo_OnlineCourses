import java.util.Scanner;

public class Grocer {
    public static void main(String[] args) {
        
      
        Scanner scan = new Scanner(System.in);        
        
        String[] store = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("\nWelcome to Java Grocers. ");
        System.out.println("What can I help you find?\n");
        String choice=scan.nextLine();
        
        for (int i = 0; i < store.length; i++) {
            
            if(choice.equals(store[i]))
                System.out.println("\nWe have that in aisle: "+i);

        }
        
        scan.close();
        
        // Compare your result to what's on Learn the Part.

    }
}
