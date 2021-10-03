import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;

public class MarsRoverTest {

    @Test
    public void TryToOpenInputFileAndCheckIfNotEmpty() {
        MarsRover mr001 = new MarsRover(); //arrange - object
        assertEquals(false,mr001.ReadFile("C:/temp/go-rovers.txt").isEmpty());}

}
