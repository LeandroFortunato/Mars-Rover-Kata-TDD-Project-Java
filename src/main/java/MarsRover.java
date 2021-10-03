import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.ArrayList;
public class MarsRover {

    public ArrayList ReadFile (String fileName){
           ArrayList<String> instructions = new ArrayList<String>();
           try {
                File myObj = new File(fileName);
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    instructions.add(data);
                    //System.out.println(data);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                //System.out.println("An error occurred.");
                //e.printStackTrace();
            }
           System.out.println(instructions);
           return instructions;
    }
}