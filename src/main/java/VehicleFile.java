import java.io.File; // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class VehicleFile {

    int numberOfVehiclesUpToNow;

    public VehicleFile() {      //constructor
        numberOfVehiclesUpToNow = 0;}

    public int[] ReadPlateauUpperRightXY(String pFileName) {

        try {
            java.io.File myObj = new java.io.File(pFileName);
            Scanner myReader = new Scanner(myObj);

            if (myReader.hasNextLine()) {

                return Functions.StrArrayToIntArray(myReader.nextLine().split(" "));}

            else {myReader.close();}

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return new int[]{};
    }

    public int[] ReadNextVehicleCurrentPositionXY() {
        return new int[]{,};
    }

    public String ReadSetOfMovesForTheVehicle() {
        return "";
    }

    public void AddOneMoreVehicle() {
    }

    public Integer GetNumberOfVehiclesSoFar() {
        return 0;
    }
}

