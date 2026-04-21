public class Minibus extends Bus {
    private String minibusId;
    private int capacity;
    private Booking[] bookings;
    private int count;

    public Minibus(String minibusId, int capacity) {
        this.minibusId = minibusId;
        this.capacity = capacity;
        this.bookings = new Booking[capacity];
        this.count = 0;
    }

    public String getMinibusId() {
        return minibusId;
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
