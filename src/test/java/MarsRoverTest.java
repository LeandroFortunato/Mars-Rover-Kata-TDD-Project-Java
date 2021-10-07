import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;

public class MarsRoverTest {

    @Test
    public void MissionExecution() {

        String [] newRoverStartingPosition;  // [X,Y,Direction]
        String roverMoves;

        //Create Mission
        MissionControl Mission = new MissionControl(); //arrange - object

        // Map target (Plateau)
        Plateau Target = new Plateau(Mission.GetPlateauUpperRightXY("C:/temp/go-rovers.txt")); //arrange - object
        assertEquals(true,Target.CalculateBoundariesXYs());

        // Obtain position of new rover on the Plateau
        newRoverStartingPosition = Mission.ReadNextVehicleInitialPositionXY();
        assertEquals(true,newRoverStartingPosition.length!=0);

        // Set rover on that position
        Rover NewRover = new Rover(Mission.AddOneMoreVehicle(),newRoverStartingPosition); //arrange - object

        // Obtain the rover journey and perform it
        System.out.println(Arrays.toString(NewRover.MoveAvoidingCollision(Mission.ReadSetOfMovesForTheVehicle())));






    }
}
