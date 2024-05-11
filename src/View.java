public class View implements Observer{
    public void welcome(){
        System.out.println("welcome to the Flight Scheduling system");
    }
    @Override
    public void updateFlight(String departure, String destination, String departureTime, String arrivalTime, int listnum){
        System.out.println("=====================================================");
        System.out.println("Flight num: " + listnum );
        System.out.println("Departure: " + departure + "    Destination:" + destination);
        System.out.println("Departure time: " + departureTime +"    Arrival time: " + arrivalTime);
        System.out.println("=====================================================");
    }

    @Override
    public void updateTicket(String departure, String destination, String departureTime, String arrivalTime, String name, String phone, String flightClass){
        System.out.println("======================================================");
        System.out.println("TICKET");
        System.out.println("NAME: " + name + " PHONE: " + phone);
        System.out.println("DEPARTURE: " + departure + "    DESTINATION: " + destination);
        System.out.println("DEPARTURE TIME: " + departureTime +"    ARRIVAL TIME: " + arrivalTime);
        System.out.println("FLIGHT CLASS: " + flightClass);
        System.out.println("======================================================");
    }
}
