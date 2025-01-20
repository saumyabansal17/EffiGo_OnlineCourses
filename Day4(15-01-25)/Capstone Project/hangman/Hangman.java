import java.util.Arrays;
import java.util.Scanner;

public class Hangman {

    public static String[] words = {"ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
    "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
    "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
    "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
    "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
    "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
    "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
    "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
    "wombat", "zebra"};

    public static String[] gallows = {"+---+\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "    |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    "+---+\n" +
    "|   |\n" +
    "O   |\n" +
    "|   |\n" +
    "    |\n" +
    "    |\n" +
    "=========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|   |\n" +
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + //if you were wondering, the only way to print '\' is with a trailing escape character, which also happens to be '\'
    "     |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" +
    "/    |\n" +
    "     |\n" +
    " =========\n",

    " +---+\n" +
    " |   |\n" +
    " O   |\n" +
    "/|\\  |\n" + 
    "/ \\  |\n" +
    "     |\n" +
    " =========\n"};

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int n=(int)(Math.random()*65);
        String word=words[n];

        int i=word.length();
        char[] uword=new char[word.length()];
        int miss=0;
        char[] misses=new char[6];
        for(int j=0;j<i;j++){
            uword[j]='_';
        }
        char g;
        while(miss<6){
            // System.out.println("Guess : "+g);

            System.out.println(gallows[miss]);

            System.out.print("Word : \t");
            printuword(uword);

            System.out.print("\nMisses : \t");
            printmiss(misses);
            
            System.out.print("\nGuess : ");
            g=scan.next().charAt(0);

            if (check(g, word, uword)) {
            } else {
                misses[miss] = g;
                miss++;
            }
            
            if (Arrays.equals(uword, word.toCharArray())) {
                System.out.print(gallows[miss]);
                System.out.print("\nWord:   ");
                printuword(uword);
                System.out.println("\nGOOD WORK!");                
                break;
            }
        }
        
        if (miss == 6) {
            System.out.print(gallows[6]);
            System.out.println("\nRIP!");
            System.out.println("\nThe word was: '" + word + "'");
        }
        scan.close();


    }

    public static void printuword(char[] uword){
        for(int i=0;i<uword.length;i++){
            System.out.print(uword[i]);
        }
    }

    public static void printmiss(char[] misses){
        for(int i=0;i<misses.length;i++){
            System.out.print(misses[i]);
        }
    }

    public static boolean check(char ch,String word,char[] uword) {
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==ch){
                uword[i]=ch;
                return true;
            }
        }
        return false;
    }
    


}





