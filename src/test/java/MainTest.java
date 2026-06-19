import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkAllStudentsAreOnBus() {
        //Arrange
        Main main = new Main();

        //Act
        main.addEveryoneToBus();

        //Assert
        assertEquals(10,main.busSeatingPlan.size());
    }

    @Test
    void checkThatSwappingSeatsWorks() {
        //Arrange
        Main main = new Main();

        //Act
        main.addEveryoneToBus();
        main.swappingSeats(0,1);

        //Assert
        assertEquals("Brandon",main.busSeatingPlan.getFirst());
        assertEquals("Ryan",main.busSeatingPlan.get(1));
    }

    @Test
    void checkGetSeatPositionWorks() {
        //Arrange
        Main main = new Main();

        //Act
        main.addEveryoneToBus();

        //Assert
        assertEquals(4,main.getSeatPosition("Jessica"));
    }

    @Test
    void checkStudentsAreInRightOrder() {
        //Arrange
        Main main = new Main();

        //Act
        main.addEveryoneToBus();
        main.swappingStudents();
        List<String> expected = List.of("Brandon","Ibrahim", "Ryan", "Brian", "Jessica", "Richard", "Antoinne", "Grace", "Zee", "Rebecca");

        //Assert
        assertEquals(expected,main.busSeatingPlan);
    }
}