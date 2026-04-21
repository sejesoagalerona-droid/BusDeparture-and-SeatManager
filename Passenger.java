public class Passenger {
    private String passengerId;
    private String name;
    private Booking booking;

    public Passenger(String passengerId, String name, Booking booking) {
        super(passengerId, name)
        this.passengerId = passengerId;
        this.name = name;
    }

    public String getPassengerId() {
        return passengerId;
    }

    public String getName() {
        return name;
    }
}
