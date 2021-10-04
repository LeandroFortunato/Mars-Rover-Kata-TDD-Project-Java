public class Plateau {

/*-----------------------------------------*/
    public int[] UpperRightCoordinateXY;
    public int[][] BoundaryAllCoordinatesXYs;
/*-----------------------------------------*/

    public boolean SetUpperRightCoordinateXY(int[] pXY) {
        UpperRightCoordinateXY = pXY;
        return true;
    }

    public int[][] CalculateBoundaryAllCoordinatesXYs(int[] pXY) {

        return new int[][]{{,}};
    }

    public void SetBoundaryAllCoordinatesXYs(int[][] pXYs) {
    }

    public int[][] getBoundaryAllCoordinatesXYs() {
        return new int[][]{{,}};
    }

}
