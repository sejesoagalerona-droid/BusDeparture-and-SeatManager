public class Passenger {
    private String passengerId;
    private String name;
    private String phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Name cannot be empty") ;
}
