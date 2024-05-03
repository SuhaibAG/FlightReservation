import java.util.Date;

public class DamJed extends ToJeddah{
    @Override
    public String getDestination() {
        return "Jeddah";
    }

    @Override
    public String getDeparture() {
        return "Dammam";
    }
    public DamJed(Date date, String arrivalTime, String departureTime) {
        this.ArrivalTime = arrivalTime;
        this.DepartureTime = departureTime;
        this.date = date;
    }
}
