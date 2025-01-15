public class RandomNumbers {
    public static void main(String[] args) {
        
        print2DArray();
    }
    public static int randomNumber() {
        double randomNumber = Math.random()*100;
        return (int)randomNumber;
    }

    public static void print2DArray(){
        for(int i=0;i<100;i++){
            for(int j=0;j<10;j++){
                System.out.print(randomNumber()+" ");
            }
            System.out.println("");
        }
    }
}
