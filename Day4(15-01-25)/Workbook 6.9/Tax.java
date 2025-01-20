import java.util.Arrays;

public class Tax {
    public static void main(String[] args) {
        double[] price = {1.99, 2.99, 3.99, 4.99};
        double[] taxprice=new double[4];
        // See instructions on Learn the Part (Workbook 6.9)
        System.out.print("\nThe original prices are: "+Arrays.toString(price));
        
        for(int i=0;i<price.length;i++){
            taxprice[i]=price[i]+(0.13*price[i]);
        }
        System.out.println("\nThe prices after tax are: "+Arrays.toString(taxprice));


    }
}
