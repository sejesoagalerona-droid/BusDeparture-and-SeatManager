public class Bus {
    private String busId;
    private int capacity;
    private Booking[] bookings;
    private int count;

    public Bus(String busId, int capacity) {
        this.busId = busId;
        this.capacity = capacity;
        this.bookings = new Booking[capacity];
        this.count = 0;
    }

    public String getBusId() {
        return busId;
    }

    public boolean hasSpace() {
        return count < capacity;
    }

    public void addBooking(Booking booking) {
        if (hasSpace()) {
            bookings[count] = booking;
            count++;
        }
    }
}