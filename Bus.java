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

    public boolean removeBooking(String bookingId) {
    for (int i = 0; i < count; i++) {
        if (bookings[i].getBookingId().equals(bookingId)) {
            bookings[i] = bookings[count - 1]; 
            bookings[count - 1] = null;
            count--;
            return true;
        }
    }
    return false;
}

    @Override
    public String toString() {
        return String.format("Bus Id: %s, Capacity: %d", getBusId(), getCapacity());
    }

    public int getBookingCount() {
    return count;
}
}
