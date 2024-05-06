import java.util.ArrayList;
import java.util.Date;

public class FlightAdapter implements Ticket{
    private String name;
    private String phoneNumber;
    private FlightSchedular flight;
    private FlightClass fClass;

    @Override
    public String getTicket() {
        return "TICKET INFORMATION" +
                "Phone Number:'" + phoneNumber + '\'' +
                ", Name:'" + name + '\'' +
                ", Destination:'" + flight.getDestination() + '\'' +
                ", Departure:'" + flight.getDeparture() + '\'' +
                ", Date:" + flight.getDate() +
                ", Arrival Time:'" + flight.getArrivalTime() + '\'' +
                ", Flight class:'" + fClass.GetClass()  ;
    }

    @Override
    public String getName() {
        return name;
    }



    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public FlightClass getfClass() {
        return fClass;
    }

    @Override
    public FlightSchedular getFlight() {
        return flight;
    }

    public FlightAdapter(String name, String phoneNumber, FlightSchedular flight, FlightClass fClass) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.flight = flight;
        this.fClass = fClass;
    }

}
