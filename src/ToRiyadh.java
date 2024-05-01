import java.util.Date;

public abstract class ToRiyadh implements FlightSchedular{
    protected String ArrivalTime;
    protected String DepartureTime;
    protected Date date;
    @Override
    public String getDepartureTime() {
        return DepartureTime;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public String getArrivalTime(){
        return ArrivalTime;
    }
}
