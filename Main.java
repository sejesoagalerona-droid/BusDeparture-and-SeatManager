import java.util.scaner;
  public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        input = new Scanner(System.in);
        
        int choice;

        do{
            System.out.println("----- Bus Seat Managemet System-----");
            System.out.println("1. View buses");
            System.out.println("2. Add buses");
            System.out.println("3. View available seats");
            System.out.println("4. Book seat");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Exit");

            choice = input.nextInt();

            switch(choice) {

                case 1:
                    System.out.println ("View buses selected");

                case 2:
                    System.out.println ("Add buses selected");

                case 3: 
                    System.out.println("View available seats selected");

                case 4: 
                    System.out.println("Book seat selected");       
                
                case 5: 
                    System.out.println("Booking cancelled");

                case 6: 
                   System.out.println("Exited");

                default: 
                    System.out.println("Invalid number! Please enter again.");

            }

        }
    }
  }