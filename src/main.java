import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller =new Controller(model, view);
        controller.view.welcome();

        controller.scheduleFlight(new DamJed(new Date(), "23:20", "22:00"));
        controller.scheduleFlight(new JedRiy(new Date(), "11:30", "10:30"));
        controller.scheduleFlight(new RiyDam(new Date(), "20:00", "19:00"));
        controller.scheduleFlight(new JedDam(new Date(), "00:00", "22:00"));
        controller.scheduleFlight(new RiyJed(new Date(), "5:00", "3:30"));

        controller.userLoop();

    }
}
