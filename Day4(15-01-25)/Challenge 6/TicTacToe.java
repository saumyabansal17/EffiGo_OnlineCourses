import java.util.Scanner;

public class TicTacToe {

    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        
            System.out.println("\nLet's play tic tac toe");
            char[][] board=new char[3][3];
            for(int i=0;i<board.length;i++){
              for(int j=0;j<board[i].length;j++){
                board[i][j]='_';
              }
            }

            printBoard(board);
            for(int i=0;i<9;i++){
              if(i%2==0){
                System.out.println("\nTurn: X\n");
                int[] spot=askUser(board);
                board[spot[0]][spot[1]]='X';
                printBoard(board);
                if(checkWin(board)==1){
                  break;
                }
              }
              else{
                System.out.println("\nTurn: 0\n");
                int[] spot=askUser(board);
                board[spot[0]][spot[1]]='0';
                printBoard(board);
                if(checkWin(board)==1){
                  break;
                }
              }
              
              if(i==8){
                System.out.println("It's a tie");
              }
            }
              
            scan.close();
        }


        public static void printBoard(char[][] board){
          for(int i=0;i<board.length;i++){
            System.out.println("\t");
            for(int j=0;j<board[i].length;j++){
              System.out.print(board[i][j]+" ");
            }
            
          }
        }

        public static int[] askUser(char[][] board){
          int i,j;
          System.out.println("- pick a row and column number: ");
          i=scan.nextInt();
          j=scan.nextInt();
          while (board[i][j] != '_') {
            System.out.print("Spot taken, try again: ");
            i = scan.nextInt();
            j = scan.nextInt();
          }
          int[] ans={i,j};
          return ans;
        }

        public static int checkWin(char[][] board){
          
          if(checkColumns(board)==3 || checkRows(board)==3 || checkLeft(board)==3 || checkRight(board)==3){
            System.out.println("\nX wins\n");
            return 1;
          }
          else if(checkColumns(board)==-3 || checkRows(board)==-3 || checkLeft(board)==-3 || checkRight(board)==-3){
            System.out.println("\n0 wins\n");
            return 1;
          }
          return 0;
        }

        public static int checkRows(char[][] board){
          int count=0;
          for(int i=0;i<board.length;i++){
            count=0;
            for(int j=0;j<board[i].length;j++){
              if(board[i][j]=='X'){
                count++;
              }
              else if(board[i][j]=='0'){
                count--;
              }
            }
          }
          return count;
        }

        public static int checkColumns(char[][] board){
          int c=0;
          for(int i=0;i<board.length;i++){
            c=0;
            for(int j=0;j<board[i].length;j++){
              if(board[j][i]=='X'){
                c++;
              }
              else if(board[i][j]=='0'){
                c--;
              }
            }
          }
          return c;
        }

        public static int checkLeft(char[][] board){
          int c=0;
          for(int i=0;i<board.length;i++){
            if(board[i][i]=='X')
              c++;
            else if(board[i][i]=='0')
              c--;
          }
          return c;
        }

        public static int checkRight(char[][] board){
          int c=0;
          for(int i=0;i<board.length;i++){
            if(board[i][board.length-1-i]=='X')
              c++;
            else if(board[i][board.length-1-i]=='0')
              c--;
          }
          return c;
        }


    /** Task 6 - Write a function that determines the winner
    
     * 
     * Inside the function:
     *   1. Make a count variable that starts at 0.
     *   2. Check every row for a straight X or straight O (Task 7).
     *   3. Check every column for a straight X or straight O (Task 8).
     *   4. Check the left diagonal for a straight X or straight O (Task 9).
     *   5. Check the right diagonal for a straight X or straight O (Task 10).
     */


}
