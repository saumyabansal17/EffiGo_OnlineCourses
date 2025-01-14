import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {

       System.out.print("I chose a number between 1 and 5. Try to guess it: ");
       int num=2;

       Scanner scan = new Scanner(System.in);
       int guess=scan.nextInt();
       while(!(num==guess)){
        System.out.print("Guess Again: ");
        guess=scan.nextInt();
       }

       System.out.println("\nYou got it!!!");
       
        scan.close();
    }

}
