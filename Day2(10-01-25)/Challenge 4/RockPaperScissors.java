import java.util.Scanner;

// import javax.naming.ServiceUnavailableException;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
        String ans=scan.nextLine();

    
        if(ans.equals("yes")){
            System.out.println("Great!");
            System.out.println("rock - paper - scissors, shoot!");
            String yourChoice=scan.nextLine();
            String computerChoice=computerChoice();
            String result=result(yourChoice, computerChoice);
            printResult(yourChoice, computerChoice, result);

        }
        else{
            System.out.println("Darn, some other time...!");
        }
              

        scan.close();
    }


    public static String computerChoice(){
        int ch=(int)(Math.random()*3);
        if(ch==0){
            return "rock";
        }
        else if(ch==1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }

    public static String result(String yourChoice,String computerChoice){
        if((yourChoice.equals("rock")  &&   computerChoice.equals("scissors")) || 
        (yourChoice.equals("paper")  &&   computerChoice.equals("rock"))||
        (yourChoice.equals("scissors")  &&   computerChoice.equals("paper"))){
            return "You win!";
        }
        else if((computerChoice.equals("rock")  &&   yourChoice.equals("scissors")) || 
        (computerChoice.equals("paper")  &&   yourChoice.equals("rock"))||
        (computerChoice.equals("scissors")  &&   yourChoice.equals("paper"))){
            return "You lose";
        }
        else if(yourChoice.equals(computerChoice)){
            return "It's a tie";
        }
        else{
            return "INVALID CHOICE";
        }
    }


    public static void printResult(String yourChoice,String computerChoice,String result){
        System.out.println("You chose: "+yourChoice);
        System.out.println("The computer chose: "+computerChoice);
        System.out.println(result+"\n");
        
    }

 
}
