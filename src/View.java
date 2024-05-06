public class View {

    public void welcome(){
        System.out.println("welcome to the Flight Scheduling system");
    }
    public void flights(String departure, String destination, String departureTime, String arrivalTime, int listnum){
        System.out.println("=====================================================");
        System.out.println("Flight num: " + listnum );
        System.out.println("Departure: " + departure + "    Destination:" + destination);
        System.out.println("Departure time: " + departureTime +"    Arrival time: " + arrivalTime);
        System.out.println("=====================================================");
    }

    public void ticket(String departure, String destination, String departureTime, String arrivalTime, String name, String phone, String flightClass){
        System.out.println("======================================================");
        System.out.println("TICKET");
        System.out.println("NAME: " + name + " PHONE: " + phone);
        System.out.println("DEPARTURE: " + departure + "    DESTINATION: " + destination);
        System.out.println("DEPARTURE TIME: " + departureTime +"    ARRIVAL TIME: " + arrivalTime);
        System.out.println("FLIGHT CLASS: " + flightClass);
        System.out.println("======================================================");
    }
}
