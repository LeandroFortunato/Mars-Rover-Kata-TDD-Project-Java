public abstract class Vehicle {

    public int number;
    public int CurrentPositionX; // (X)
    public int CurrentPositionY; // (Y)
    public String CurrentDirection; // (Direction)

    public String [] MoveAvoidingCollision(String pSetOfMovesFromFile) {

        String[] Moves = pSetOfMovesFromFile.split("");
        String [] directions = {"N","E","S","W"};
        int [] clockwise = {1,2,3,4};


        for (int i = 0; i <Moves.length; i++) {
            if (Moves[i].equals("M")) {
                if (this.CurrentDirection.equals("N")) {
                    this.CurrentPositionY++;
                } else if (this.CurrentDirection.equals("S")) {
                    this.CurrentPositionY--;
                } else if (this.CurrentDirection.equals("E")) {
                    this.CurrentPositionX++;
                } else { // It is "W"
                    this.CurrentPositionX--;
                }
            } else {  // it is either L or R
                // clockwise {"N1E2S3W4"} = {1,2,3,4}
                //getClockwiseNumber(this.CurrentDirection)
                this.CurrentDirection = Moves[i];
            }
        }

        return new String[]{String.valueOf(CurrentPositionX),
                            String.valueOf(CurrentPositionY),
                            CurrentDirection};
    }
}

