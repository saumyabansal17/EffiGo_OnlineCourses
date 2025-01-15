import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int value=scan.nextInt();
        String[][] data=new String[value][3];
        
        for(int i=0;i<value;i++){
            
            System.out.println("\n\tFigure " + (i+1)); 
            scan.nextLine();
            System.out.print("\t - Name: ");
            data[i][0]=scan.nextLine();   

            System.out.print("\t - Date of birth: ");
            data[i][1]=scan.nextLine();

            System.out.print("\t - Occupation: ");
            data[i][2]=scan.nextLine(); 

            System.out.print("\n");
            
        }

        System.out.println("These are the values you stored:"); 
        print2DArray(data); 

        System.out.print("\nWho do you want information on? ");  
        String info=scan.nextLine();
        int match=0;
        for(int i=0;i<data.length;i++){
            for(int j=0;j<1;j++){
                if(data[i][j].equals(info)){
                    match=i;
                }
            }

        }
        for(int i=0;i<3;i++){
            switch (i) {
                case 0:
                    System.out.println("\t Name: "+data[match][i]);
                    break;
                case 1:
                    System.out.println("\t Date of birth: "+data[match][i]);
                    break;
                case 2:
                    System.out.println("\t Occupation: "+data[match][i]);
                    break;
                default:
                    break;
            }
              
            
        }
        /*Task 5: Let the user search the database by name. 
            If there's a match:
              print(    tab of space    Name: <name>)
              print(    tab of space    Date of birth: <date of birth>)
              print(    tab of space    Occupation: <occupation>)

        */        

        scan.close();
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " "); 
            }
            System.out.print("\n");
        }
    }


}
