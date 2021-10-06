import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;

public class MarsRoverTest {

    @Test
    public void CheckIfFirstLineOfVehicleFileIsOK() {
        VehicleFile vf001 = new VehicleFile(); //arrange - object
        int[] tst001 = vf001.ReadPlateauUpperRightXY("C:/temp/go-rovers.txt");
        assertEquals(true,tst001.length!=0);

        Plateau pl001 = new Plateau(); //arrange - object
        assertEquals(true,pl001.SetUpperRightCoordinateXY(tst001));

        assertEquals(true,pl001.CalculateBoundaryAllCoordinatesXYs());

        Rover rv001 = new Rover(); //arrange - object
        vf001.AddOneMoreVehicle();

        System.out.println(vf001.numberOfVehiclesUpToNow);

        String[] tst002 = vf001.ReadNextVehicleCurrentPositionXY();
        System.out.println(Arrays.toString(tst002));
        assertEquals(true,tst002.length!=0);



    }
}
