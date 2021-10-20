import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class MarsRoverTest {
    private String[] input;
    private String[] expectedOutput;
    private Plateau newPlateau ;
    private Mission newMission;


    public MarsRoverTest(Object[] pInput, Object[] pExpectedOutput) {
        this.input = Arrays.asList(pInput).toArray(new String[pInput.length]);
        this.expectedOutput = Arrays.asList(pExpectedOutput).toArray(new String[pExpectedOutput.length]);;

    }

    @Parameterized.Parameters
    public static Collection NewRoversProvidingTheirStartSequenceOfMovesAndEnd() {

        return Arrays.asList(new Object[][][] {
                {new Object [] {"1 2 N", "LMLMLMLMM"},
                        new Object[] {"1 3 N"}},
                {new Object [] {"3 3 E", "MMRMMRMRRM"},
                        new Object[] {"5 1 E"}},
                });
    }

    @Test
    public void MapPlateauCreateMissionAndMoveRover() {

        // ------------------- Arrange objects for the Mission -----------------------------------

        // PLATEAU - Create Plateau with all coordinates that compose its boundaries
        newPlateau = new Plateau(Stream.of("5 5".split(" ")).mapToInt(Integer::parseInt).toArray());

        // MISSION - Create Mission
        newMission = new Mission();

        // ROVER - create rover and sets it to its starting position
        Rover NewRover = new Rover(newMission.AddOneMoreVehicle(), this.input[0].split(" "));

        // ------------------- Act/Assert -----------------------------------------
        // Performs journey
        assertEquals(this.expectedOutput[0],NewRover.MoveAvoidingCollision(this.input[1]));
        System.out.println("Final position expected: " +  this.expectedOutput[0]);
    }
}
