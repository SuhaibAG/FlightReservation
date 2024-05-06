import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Model model;
    View view;

    Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void scheduleFlight(FlightSchedular flight) {
        model.addFlight(flight);
    }

    public void printFlights(){
        ArrayList<FlightSchedular> scheduleFlight = model.getSchedule();
        for (int i = 0; i < scheduleFlight.size(); i++) {
            FlightSchedular flight = scheduleFlight.get(i);
            view.flights(flight.getDeparture(), flight.getDestination(), flight.getDepartureTime(), flight.getArrivalTime(), i);
        }
    }

   public void viewTicketList() {
       for (int i = 0; i < model.getTicketList().size(); i++) {
           Ticket ticket = model.getTicketList().get(i);
           view.ticket(ticket.getFlight().getDeparture(), ticket.getFlight().getDestination(),
                   ticket.getFlight().getDepartureTime(), ticket.getFlight().getArrivalTime()
                   ,ticket.getName(), ticket.getPhoneNumber(), ticket.getfClass().GetClass());

       }
    }
    public void userLoop(){
        Scanner input = new Scanner(System.in);
        boolean done = true;
        while(done) {
            System.out.println("enter your name");
            String name = input.next();
            System.out.println("enter your number");
            String number = input.next();
            System.out.println("choose a flight");
            this.printFlights();
            int flightnum = input.nextInt();

            System.out.println("Enter (1) for a first class flight, Enter (2) for an economy class flight ");
            int choice = input.nextInt();
            FlightClass fClass = new FlightClass();

            if (choice == 1){
               fClass.setStrategy(new First());
            }
            else{
                fClass.setStrategy(new Economy());
            }

            Ticket ticket = new FlightAdapter(name, number, this.model.getSchedule().get(flightnum), fClass);
            view.ticket(ticket.getFlight().getDeparture(), ticket.getFlight().getDestination(),
                    ticket.getFlight().getDepartureTime(), ticket.getFlight().getArrivalTime()
                    ,ticket.getName(), ticket.getPhoneNumber(), ticket.getfClass().GetClass());
            this.model.getTicketList().add(ticket);

            System.out.println("Enter (1) to view ticket list");
            choice = input.nextInt();
            if(choice == 1){
                this.viewTicketList();
            }

        }
    }
}
