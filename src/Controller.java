public class Controller {
    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void bookTicket(Ticket ticket) {

        model.ticketList.add(ticket);
    }

    public void scheduleFlight(FlightSchedular flight) {
        model.schedule.add(flight);
    }

    public View FlightSchedule() {
        return view;
    }

    public void viewTicketList() {
        model.ticketList.forEach(t -> t.getTicket());
    }
}
