public class Booking {
    private String bookingId;
    private Passenger passenger;
    private String vehicleId; // I made it so it works for both veicles

    public Booking(String bookingId, Passenger passenger, String vehicleId) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.vehicleId = vehicleId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getVehicleId() {
        return vehicleId;
    }
}