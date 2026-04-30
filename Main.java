import java.util.Scanner;
  public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        System.out.println("Enter a number from 1-6: ");
        input = input.nextInt();
        
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
                if (bus.isEmpty()){
                   System.out.println("Buses unavailable!")
                     }else{
                        for(Bus b:buses){ //loops through each bus in the list
                          System.out.println(b);
                        }
                   break;

                case 2:
                System.out.println("Enter Bus ID: ");
                  String busid = input.next();
                
                System.out.println("Enter bus capacity: ");
                  int capacity = input.next();

                Bus newBus = new Bus(busid, capacity);
                buses.add(new Bus);
                System.out.println ("Add buses selected");
                
                break;
                
                case 3: 
                    if (buses.isEmpty()){
                      System.out.println("No available buses");
                    } else{ 
                      for (Bus b:buses)
                        int availableSeats = gethasSpace();
                      System.out.println("Bus" + getbusid() + "has" + getavailableSeats() + "seats left.");
                    break;
                case 4: 
                  if ( bus.hasSpace()) {
                    System.out.println (getBookingID());
                    System.out.println (getPassenger());
                  }

                
                    break;
                case 5: 
                    System.out.println("Booking cancelled");
                    break;
                case 6: 
                   System.out.println("Exited");
                    break;
                default: 
                    System.out.println("Invalid number! Please enter again.");
                

            }
          scanner.close();

        }
    }
  }
