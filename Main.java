import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        int choice;
        do {
            System.out.println("----- Bus Seat Management System -----");
            System.out.println("1. View buses");
            System.out.println("2. Add bus");
            System.out.println("3. View available seats");
            System.out.println("4. Book seat");
            System.out.println("5. Cancel Booking");
            System.out.println("6. Exit");
            System.out.print("Enter a number from 1-6: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    if (buses.isEmpty()) {
                        System.out.println("Buses unavailable!");
                    } else {
                        for (Bus b : buses) {
                            System.out.println(b);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Enter Bus ID: ");
                    String busId = input.next();
                    System.out.println("Enter bus capacity: ");
                    int capacity = input.nextInt();
                    buses.add(new Bus(busId, capacity));
                    System.out.println("Bus added successfully!");
                    break;

                case 3:
                    if (buses.isEmpty()) {
                        System.out.println("No available buses");
                    } else {
                        for (Bus b : buses) {
                            int availableSeats = b.getCapacity() - b.getBookingCount();
                            System.out.println("Bus " + b.getBusId() + " has " + availableSeats + " seats left.");
                        }
                    }
                    break;

                case 4:
                    System.out.println("Enter Bus ID to book: ");
                    String bookBusId = input.next();
                    for (Bus b : buses) {
                        if (b.getBusId().equals(bookBusId) && b.hasSpace()) {
                            System.out.println("Enter Passenger Name: ");
                            String name = input.next();
                            System.out.println("Enter Passenger ID: ");
                            String pid = input.next();
                            Passenger p = new Passenger(pid, name);
                            String bookingId = "B" + (bookings.size() + 1);
                            Booking booking = new Booking(bookingId, p, bookBusId);
                            b.addBooking(booking);
                            bookings.add(booking);
                            System.out.println("Booking successful! ID: " + bookingId);
                        }
                    }
                    break;

                case 5:
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings to cancel.");
                    } else {
                        System.out.println("Enter Booking ID to cancel: ");
                        String cancelId = input.next();
                        boolean found = false;
                        for (int i = 0; i < bookings.size(); i++) {
                            if (bookings.get(i).getBookingId().equals(cancelId)) {
                                String busId2 = bookings.get(i).getVehicleId();
                                for (Bus b : buses) {
                                    if (b.getBusId().equals(busId2)) {
                                        b.removeBooking(cancelId);
                                        break;
                                    }
                                }
                                bookings.remove(i);
                                found = true;
                                System.out.println("Booking " + cancelId + " cancelled.");
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Booking ID not found.");
                        }
                    }
                    break;

                case 6:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid number! Please enter again.");
            }

        } while (choice != 6);

        input.close();
    }
}
