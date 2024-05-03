import java.util.Date;

public class JedDam extends ToDammam{
    @Override
    public String getDestination() {
        return "Dammam";
    }

    @Override
    public String getDeparture() {
        return "Jeddah";
    }
    public JedDam(Date date, String arrivalTime, String departureTime) {
        this.ArrivalTime = arrivalTime;
        this.DepartureTime = departureTime;
        this.date = date;
    }

}
