import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;

public class MarsRoverTest {

    @Test
    public void CheckReadPlateauUpperRightXY() {
        VehicleFile vf001 = new VehicleFile(); //arrange - object
        assertEquals(false,vf001.ReadPlateauUpperRightXY("C:/temp/go-rovers.txt").length!=0);}


}
