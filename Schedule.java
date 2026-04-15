public class Schedule {
    private String departureTime;
    private String arrivalTime;
    private Route route;

    public Schedule(String departureTime, String arrivalTime, Route route) {
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.route = route;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Route getRoute() {
        return route;
    }
}