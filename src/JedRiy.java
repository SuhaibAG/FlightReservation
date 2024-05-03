import java.util.Date;

public class JedRiy extends ToRiyadh{
    @Override
    public String getDestination() {
        return "Riyadh";
    }

    @Override
    public String getDeparture() {
        return "Jeddah";
    }
    public JedRiy(Date date, String arrivalTime, String departureTime) {
        this.ArrivalTime = arrivalTime;
        this.DepartureTime = departureTime;
        this.date = date;
    }

}
