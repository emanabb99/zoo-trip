import java.util.ArrayList;
import java.util.Collections;

public class Main {
    ArrayList<String> busSeatingPlan = new ArrayList<>();

    public void addEveryoneToBus() {
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
    }

    public void swappingSeats(int originalSeat, int seatToSwap) {
        Collections.swap(busSeatingPlan,originalSeat,seatToSwap);
    }

    public int getSeatPosition(String student){
        return busSeatingPlan.indexOf(student);
    }

    public void swappingStudents(){
        int ibrahimsSeat = getSeatPosition("Ibrahim");
        int rebeccasSeat = getSeatPosition("Rebecca");
        int richardsSeat = getSeatPosition("Richard");
        int antoinnesSeat = getSeatPosition("Antoinne");
        int ryansSeat = getSeatPosition("Ryan");
        swappingSeats(ibrahimsSeat,0);
        swappingSeats(rebeccasSeat,9);
        swappingSeats(richardsSeat,antoinnesSeat-1);
        swappingSeats(ryansSeat,rebeccasSeat-1);
    }

    static void main() {
        Main main = new Main();
        main.addEveryoneToBus();
        main.swappingStudents();

        System.out.println(main.busSeatingPlan);
    }
}
