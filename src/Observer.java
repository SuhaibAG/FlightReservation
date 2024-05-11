public interface Observer {


    void updateFlight(String departure, String destination, String departureTime, String arrivalTime, int listnum);

    void updateTicket(String departure, String destination, String departureTime, String arrivalTime, String name, String phone, String flightClass);
}
