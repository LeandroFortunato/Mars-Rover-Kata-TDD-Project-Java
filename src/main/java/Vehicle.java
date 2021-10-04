public abstract class Vehicle {

    int OrderInTheFile;
    public int[] CurrentPositionXYAndDirection; // (X,Y,Direction)

    public void CreateNewOne(int pNumber) {
    }

    public void SetCurrentPositionXY(int[] pXY) {
    }

    public int[] MoveAvoidingCollision(int[] pXYDirection,
                                       String pSetOfMovesFromFile,
                                       int[][] pPlateauAllBoundaryCoordinatesXYs,
                                       int[][] pCurrentPositionsOfAllOtherInformedSoFarXYs) {

        return new int[]{,};
    }

}

