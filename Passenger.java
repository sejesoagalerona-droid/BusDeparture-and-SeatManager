public class Passenger {
    private String passengerId;
    private String name;
    private String phoneNumber;
    private Booking booking;

    public Passenger(String passengerId, String name, String phoneNumber, Booking booking) {
        this.passengerId = passengerId;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

@Override
public String toString() {
    return String("Passenger: %s , Id: %s , phoneNumber: %s" , getName(), Id, phoneNumber);
}
