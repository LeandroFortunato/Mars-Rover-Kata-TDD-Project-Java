import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MarsRoverTest {

    @Test
    public void ExecuteMission() {

        String [] outPutTestArray = {"1 3 N","5 1 E"};


        // ------------------- Arrange -----------------------------------------

        //Create Mission
        MissionControl Mission = new MissionControl(); //arrange - object

        // Map target (Plateau)
        Plateau Target = new Plateau(Mission.GetPlateauUpperRightXY("C:/temp/go-rovers.txt")); //arrange - object

        // ------------------- Act/Assert -----------------------------------------

        assertEquals(false, Target.CalculateBoundariesXYs());


        for (String outPutTest : outPutTestArray) {

            // ------------------- Arrange -----------------------------------------

            // Obtain position of new rover on the Plateau
           String [] newRoverStartingPosition = Mission.ReadNextVehicleInitialPositionXY();

            // ------------------- Act/Assert -----------------------------------------

            assertEquals(false, newRoverStartingPosition.length == 0);


            // ------------------- Arrange -----------------------------------------

            // Set rover on that position
            Rover NewRover = new Rover(Mission.AddOneMoreVehicle(), newRoverStartingPosition); //arrange - object


            // ------------------- Act/Assert -----------------------------------------

            // Obtain the rover journey and perform it
            assertEquals( outPutTest,NewRover.MoveAvoidingCollision
                                        (Mission.ReadSetOfMovesForTheVehicle()));


        }
    }
}
