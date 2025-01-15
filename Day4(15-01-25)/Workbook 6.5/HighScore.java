public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] score={randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber()};
        System.out.print("\nHere are the scores :");
        for(int i=0;i<10;i++){
            System.out.print(score[i]+" ");
            if(highScore<score[i]){
                highScore=score[i];
            }
        }


        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    

    public static int randomNumber(){
        int num=(int)(Math.random()*50000);
        return num;
    }

}
