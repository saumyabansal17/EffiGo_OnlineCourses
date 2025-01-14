import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.println("\nPick a number to count by: ");
        int c=scan.nextInt();
        System.out.println("Pick a number to start counting from: ");
        int start=scan.nextInt();
        System.out.println("Pick a number to count to: ");
        int end=scan.nextInt();

        for(int i=start;i<=end;i+=c){
            System.out.print(i+" ");
        }
 
       // See detailed instructions on Learn the Part.

        scan.close();
    }
}
