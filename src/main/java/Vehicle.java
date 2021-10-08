public abstract class Vehicle {

    public int number;
    public int CurrentPositionX; // (X)
    public int CurrentPositionY; // (Y)
    public String CurrentDirection; // (Direction)

    public String [] MoveAvoidingCollision(String pSetOfMovesFromFile) {

        String[] Moves = pSetOfMovesFromFile.split("");
        String [] clockwiseDirections = {"N","E","S","W"};


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
            } else {  // Moves[i] is either "L" (-1,anticlockwise) or "R" (+1,clockwise)

                for (int pointer = 0; pointer < 4; pointer++) {
                    if (this.CurrentDirection.equals(clockwiseDirections[pointer])){
                          if (Moves[i].equals("L")) { //  anticlockwise(-1)
                              this.CurrentDirection = clockwiseDirections[(pointer + 3) % 4];
                        } else {// it is "R", clockwise(+1)
                              this.CurrentDirection = clockwiseDirections[(pointer + 1) % 4];}
                    break;
                    }
                }
            }
        }

        return new String[]{String.valueOf(CurrentPositionX),
                            String.valueOf(CurrentPositionY),
                            CurrentDirection};
    }
}

