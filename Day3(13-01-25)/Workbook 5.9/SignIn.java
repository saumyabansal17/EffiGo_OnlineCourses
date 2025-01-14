import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
      
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String uname=scan.nextLine();
        System.out.print("- Password: ");
        String pass=scan.nextLine();

        while(!(username.equals(uname) && password.equals(pass))){
            System.out.println("\n Incorrect, please try again\n");
            System.out.print("- Username: ");
            uname=scan.nextLine();
            System.out.print("- Password: ");
            pass=scan.nextLine();

        }
        System.out.println("\nSign in Successful. Welcome!!!\n");

        
        scan.close();
        
    }
}
