import java.io.File; // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class MissionControl {

    int vehiclesInOperation;
    String [][] lastPositionOfAllVehicles;
    Scanner myReader;

    public MissionControl() {      //constructor
        vehiclesInOperation = 0;}

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
            //return Functions.StrArrayToIntArray(myReader.nextLine().split(" "));}
        else {myReader.close();}

        return new String[]{};
    }

    public String ReadSetOfMovesForTheVehicle() {
        if (myReader.hasNextLine()) {

            return myReader.nextLine();}

        else {myReader.close();}

        return "";
    }

    public int AddOneMoreVehicle() {

        return vehiclesInOperation++;
    }

}

