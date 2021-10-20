import java.util.ArrayList;

public class Mission {

    int vehiclesInOperation;
    ArrayList<String> currentPositionOfAllVehicles; // XYD's

    public Mission() {      //constructor
        vehiclesInOperation = 0;
        currentPositionOfAllVehicles = new ArrayList<String>();}

    public int AddOneMoreVehicle() {
        return vehiclesInOperation++;
    }

    public void AddEndPositionToTheMapOfAllVehicles(String pXYD){

        // functionality to be implemented later

        currentPositionOfAllVehicles.add(pXYD);
    }

    public boolean TheIntendedMoveWillCollideRoverToAnother(int pNextPositionX,
                                                            int pNextPositionY) {
        // functionality to be implemented later
        return false;}

}

