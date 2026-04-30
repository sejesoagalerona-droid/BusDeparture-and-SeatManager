public class Minibus extends Bus {
    private String minibusId;

    public Minibus(String minibusId, int capacity) {
        super(minibusId, capacity);
        this.minibusId = minibusId;
    }

    public String getMinibusId() {
        return minibusId;
    }

    @Override
    public String toString() {
        return String.format("Minibus Id: %s, Capacity: %d", getMinibusId(), getCapacity());
    }
}
