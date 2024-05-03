import java.util.Date;

public class RiyJed extends ToJeddah{
    @Override
    public String getDestination() {
        return "Jeddah";
    }

    @Override
    public String getDeparture() {
        return "Riyadh";
    }

    public RiyJed(Date date, String arrivalTime, String departureTime) {
        this.ArrivalTime = arrivalTime;
        this.DepartureTime = departureTime;
        this.date = date;
    }
}
