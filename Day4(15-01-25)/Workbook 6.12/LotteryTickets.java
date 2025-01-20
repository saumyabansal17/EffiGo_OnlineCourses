import java.util.Arrays;

public class LotteryTickets {
    public static void main(String[] args) {
        
        // Instructions for this workbook are on Learn the Part (workbook 6.12)
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2=Arrays.copyOf(ticket, ticket.length);
        ticket2[2]=54;
        System.out.print("Ticket 1 numbers: ");
        printTicket(ticket);
        System.out.print("\nTicket 2 numbers: ");
        printTicket(ticket2); 
    }

    public static void printTicket(int[] ticket){
        for(int i=0;i<ticket.length;i++){
            System.out.print(ticket[i]+" ");
        }
    }
}



