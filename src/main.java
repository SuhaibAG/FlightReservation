import java.util.ArrayList;
import java.util.Date;

public class main {
    public static void main(String[] args) {
        ArrayList<FlightSchedular> flights = new ArrayList<>();
        flights.add(new DamJed(new Date(), "23:00", "22:00"));
        flights.add(new JedRiy(new Date(), "23:00", "22:00"));
        flights.add(new RiyDam(new Date(), "23:00", "22:00"));
        flights.add(new JedDam(new Date(), "23:00", "22:00"));
        flights.add(new RiyJed(new Date(), "23:00", "22:00"));

        for (int i = 0; i < flights.size(); i++) {
            System.out.println(flights.get(i));
        }
    }
}
