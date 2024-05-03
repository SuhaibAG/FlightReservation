import java.util.Date;

public class RiyDam extends ToDammam{
    @Override
    public String getDestination() {
        return "Dammam";
    }

    @Override
    public String getDeparture() {
        return "Riyadh";
    }
    public RiyDam(Date date, String arrivalTime, String departureTime) {
        this.ArrivalTime = arrivalTime;
        this.DepartureTime = departureTime;
        this.date = date;
    }
}
