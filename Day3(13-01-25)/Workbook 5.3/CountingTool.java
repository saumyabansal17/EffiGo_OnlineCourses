import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Choose a number to count to : ");
        int ch=scan.nextInt();

        for(int i=0;i<ch;i++){
            System.out.print(i+" ");
        }
        
        scan.close();
    }
}
