import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    static void main() {
        ArrayList<String> busSeatingPlan = new ArrayList<>();

        busSeatingPlan.add("Ryan");
        busSeatingPlan.add("Brandon");
        busSeatingPlan.add("Rebecca");
        busSeatingPlan.add("Richard");
        busSeatingPlan.add("Jessica");
        busSeatingPlan.add("Brian");
        busSeatingPlan.add("Antoinne");
        busSeatingPlan.add("Grace");
        busSeatingPlan.add("Zee");
        busSeatingPlan.add("Ibrahim");

        System.out.println(busSeatingPlan);

        Collections.swap(busSeatingPlan,busSeatingPlan.indexOf("Ibrahim"),0);

        Collections.swap(busSeatingPlan,busSeatingPlan.indexOf("Rebecca"),9);

        Collections.swap(busSeatingPlan,busSeatingPlan.indexOf("Richard"),busSeatingPlan.indexOf("Antoinne")-1);

        Collections.swap(busSeatingPlan,busSeatingPlan.indexOf("Ryan"),busSeatingPlan.indexOf("Rebecca")-1);

        System.out.println(busSeatingPlan);




    }
}
