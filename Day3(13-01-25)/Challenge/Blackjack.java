import java.util.Scanner;


public class Blackjack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();

        int num1=drawRandomCard();
        int num2=drawRandomCard();
        String card1=cardString(num1);
        String card2=cardString(num2);
        System.out.println("\n You get a \n" + card1+"\n and a \n"+card2);

        int hand_val;
        hand_val=Math.min(num1,10)+Math.min(num2,10);

        System.out.println("Your Total is: "+hand_val);

        int dnum1=drawRandomCard();
        int dnum2=drawRandomCard();
        String dcard1=cardString(dnum1);
        String dcard2=cardString(dnum2);
        int dtotal=Math.min(dnum1,10)+Math.min(dnum2,10);
        System.out.println("\n The dealer shows \n" + dcard1+"\n and a card facing down \n"+faceDown());
        System.out.println("The dealer's total is hidden");
        
        String ans=hitOrStay();
        while(ans.equals("hit")){
            int n=drawRandomCard();
            String cardt=cardString(n);
            System.out.println("\n You get a \n"+cardt);
            hand_val+=Math.min(n, 10);
            System.out.println("Your new total is : "+hand_val);
            if(hand_val>21){
                System.out.println("\nBust! Player loses\n");
                return;
            }
            ans=hitOrStay();
        }

        if(ans.equals("stay")){
            System.out.println("\n Dealer's turn");
            System.out.println("\nThe dealer's cards are \n"+dcard1+"\n and a \n"+dcard2);
            
            while(dtotal<17){
                int numd=drawRandomCard();
                String dcard=cardString((numd));
                dtotal+=Math.min(10, numd);
                System.out.println("\nDealer gets a\n"+dcard);
                System.out.println("\nDealer's total is "+dtotal);
                if(dtotal>21){
                    System.out.println("\nBust! Dealer loses\n");
                    return;
                }
            }
        }

        if(hand_val>dtotal){
            System.out.println("Player wins!!\n");
        }
        else{
            System.out.println("Dealer wins!!\n");
        }
        
     
        scan.close();

    }

    public static int drawRandomCard(){
        int choose=(int)(Math.random()*13);
        return (choose+1);
    }

    public static String cardString(int choose){
        String card="";
        switch(choose){
            case 1:
                card="   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
                break;
            case 2:
                card="   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                break;
            case 3:
                card="   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
                break;
            case 4:
                card="   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
                break;
            case 5:
                card="   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                break;
            case 6:
                card="   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                break;
            case 7:
                card="   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                break;
            case 8:
                card="   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                break;
            case 9:
                card="   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
                break;
            case 10:
                card="   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                break;
            case 11:
                card="   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                break;
            case 12:
                card="   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                break;
            case 13:
                card="   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                break;
            default:
                break;
        }
        return card;
    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

    public static String hitOrStay(){
        String ans1;
        System.out.println("Would you like to hit or stay?");
        ans1=scan.nextLine();
        while(!(ans1.equals("hit") || ans1.equals("stay"))){
            System.out.println("Please write 'hit' or 'stay'");
            ans1=scan.nextLine();
        }
        return ans1;
    }
}
    
   

