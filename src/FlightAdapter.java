import java.util.Date;

public class FlightAdapter implements Ticket{
    private String name;
    private String phoneNumber;
    private FlightSchedular flight;

    @Override
    public String getTicket() {
        return "TICKET INFORMATION" +
                "Phone Number:'" + phoneNumber + '\'' +
                ", Name:'" + name + '\'' +
                ", Destination:'" + flight.getDestination() + '\'' +
                ", Departure:'" + flight.getDeparture() + '\'' +
                ", Date:" + flight.getDate() +
                ", Arrival Time:'" + flight.getArrivalTime() + '\'' ;
    }
}
