import java.util.Scanner;

public class JavaRolls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Rolling Java. Type anything to start.");
        String start=scan.nextLine();

        System.out.println("Great, here are the rules:\n\n"+
        "- If you roll a 6, the game stops.\n"+
        "- If you roll a 4, nothing happens.\n"+
        "- Otherwise, you get 1 point.\n"+
        "You must collect at least 3 points to win. Enter anything to roll:\n");
        
        scan.nextLine();
        int score = 0;
        int diceRoll=rollDice();
        while(diceRoll!=6){
            if(diceRoll==4){
                System.out.println("You rolled a "+diceRoll+". Zero points. Keep Rolling");
            }
            else{
                System.out.println("You rolled a "+diceRoll+". One point. Keep Rolling"); 
                score+=1;
            }
            diceRoll=rollDice();
        }

        System.out.println("\nYour Score: "+score);
        if(score>=3){
            System.out.println("Wow, You WIN!!!\n");
        }
        else{
            System.out.println("Better Luck Next Time.\n");
        }
        scan.close();
    }
  
    public static int rollDice(){
        int roll=(int)(Math.random()*7);
        return roll;
    }
    
    
}
