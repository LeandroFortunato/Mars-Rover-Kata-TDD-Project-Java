import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class MissionControl {

    int vehiclesInOperation;
    String [][] currentPositionOfAllVehicles; // XYD's
    Scanner myReader;

    public MissionControl() {      //constructor
        vehiclesInOperation = 0;
        currentPositionOfAllVehicles = new String [][]{};}

    public int[] GetPlateauUpperRightXY(String pFileName) {

        try {
            java.io.File myObj = new java.io.File(pFileName);
            myReader = new Scanner(myObj);

            if (myReader.hasNextLine()) {

                return Functions.StrArrayToIntArray(myReader.nextLine().split(" "));}

            else {myReader.close();}

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new int[]{};
    }

    public String[] ReadNextVehicleInitialPositionXY() {

        if (myReader.hasNextLine()) {

            return myReader.nextLine().split(" ");}

        else {myReader.close();}

        return new String[]{};
    }

    public String ReadSetOfMovesForTheVehicle() {
        if (myReader.hasNextLine()) {

            return myReader.nextLine();}

        else {

            myReader.close();}

        return "";
    }

    public String [][] AddEndPositionToTheMapOfAllVehicles(String[] pXYD){

        System.out.println((currentPositionOfAllVehicles.length)); //

        String[][] newArray = new String[currentPositionOfAllVehicles.length+1][3];

        for (int i = 0; i < currentPositionOfAllVehicles.length; i++) {
            newArray[i] = currentPositionOfAllVehicles[i];
        }
        newArray[currentPositionOfAllVehicles.length] = pXYD;
        currentPositionOfAllVehicles = newArray;

        return  currentPositionOfAllVehicles;
    }

    public int AddOneMoreVehicle() {

        return vehiclesInOperation++;
    }

    public boolean TheIntendedMoveWillCollideRoverToAnother(int pNextPositionX,
                                                            int pNextPositionY) {

        // functionality to be implemented later

        return false;}
}

