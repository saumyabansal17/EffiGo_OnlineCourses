public class Receipt {
    public static void main(String[] args) {

        String[] store={"Gala", "Granny Smith", "Macintosh"};
        double[] prize={1.99, 1.49, 1.29};
        System.out.println("Here's your receipt:\n");
        for(int i=0;i<store.length;i++){
            System.out.println("\t"+store[i]+": $"+prize[i]); 
        }
        
    }
}
