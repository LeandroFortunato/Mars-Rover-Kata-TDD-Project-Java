import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Ignore;

public class MarsRoverTest {

    @Test
    public void CheckFileIsOpened() {
        MarsRover mr001 = new MarsRover(); //arrange - object
        assertEquals(true, mr001.OpenFile("xyz"));}
}
