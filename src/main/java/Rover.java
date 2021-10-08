public class Rover extends Vehicle{

    public Rover (int p_number, String[] pCurrentPositionXYAndDirection) {
        this.number = p_number;
        this.CurrentPositionX = Integer.valueOf(pCurrentPositionXYAndDirection[0]); // (X)
        this.CurrentPositionY = Integer.valueOf(pCurrentPositionXYAndDirection[1]); // (Y)
        this.CurrentDirection = pCurrentPositionXYAndDirection[2]; // (Direction)
    }
}
