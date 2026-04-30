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

    public int getCapacity() {
        return capacity;
    }

    public boolean hasSpace() {
        return count < capacity;
    }

    public boolean addBooking(Booking booking) {
        if (hasSpace()) {
            bookings[count] = booking;
            count++;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("Bus Id: %s, Capacity: %d", getBusId(), getCapacity());
    }
}
