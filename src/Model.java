import java.util.ArrayList;

public class Model {
    private ArrayList<FlightSchedular> schedule = new ArrayList<FlightSchedular>();
    private ArrayList<Ticket> ticketList = new ArrayList<Ticket>();

    public void addFlight(FlightSchedular flight){
        schedule.add(flight);
    }
    public void addTicket(Ticket ticket){
        ticketList.add(ticket);
    }

    public ArrayList<FlightSchedular> getSchedule() {
        return schedule;
    }

    public ArrayList<Ticket> getTicketList() {
        return ticketList;
    }
}
