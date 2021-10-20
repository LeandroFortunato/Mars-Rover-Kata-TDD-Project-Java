

public class Rover extends Vehicle{

    public Rover (int p_number, String[] pCurrentPositionXYAndDirection) {
        this.number = p_number;
        this.CurrentPositionX = Integer.valueOf(pCurrentPositionXYAndDirection[0]); // (X)
        this.CurrentPositionY = Integer.valueOf(pCurrentPositionXYAndDirection[1]); // (Y)
        this.CurrentDirection = pCurrentPositionXYAndDirection[2]; // (Direction)

        System.out.println("New Rover created");
        System.out.println("Rover set to position: "+this.CurrentPositionX
                                                +this.CurrentPositionY
                                                +this.CurrentDirection);

    }
}
