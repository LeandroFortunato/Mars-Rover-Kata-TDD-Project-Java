import java.util.Arrays;
import apache.org/proper/commons-lang;

public class Plateau {

/*-----------------------------------------*/
    public int[] UpperRightCoordinateXY;
    public int[][] BoundaryAllCoordinatesXYs;
/*-----------------------------------------*/

    public boolean SetUpperRightCoordinateXY(int[] pXY) {
        UpperRightCoordinateXY = pXY;
        return true;
    }

    public int[][] CalculateBoundaryAllCoordinatesXYs() {

        /*--------  UpperRightCoordinateXY[0] = X-final
                    UpperRightCoordinateXY[1] = Y-final   ------------*/

        /* -------- GENERATE ALL XYs FROM BOTTOM LINE ------------*/

        int[][] bottomLineXYs  = new int[UpperRightCoordinateXY[0]][2];

        for (int i = 0; i <UpperRightCoordinateXY[0]; i++) {
            bottomLineXYs[i][0] = i;
            bottomLineXYs[i][1] = 0;}

        int[][] topLineXYs  = new int[UpperRightCoordinateXY[0]][2];

        for (int i = 0; i <UpperRightCoordinateXY[0]; i++) {
            topLineXYs[i][0] = i;
            topLineXYs[i][1] = UpperRightCoordinateXY[0];}

        int[][] leftLineXYs  = new int[UpperRightCoordinateXY[1]][2];

        for (int i = 0; i <UpperRightCoordinateXY[1]; i++) {
            leftLineXYs[i][0] = 0;
            leftLineXYs[i][1] = i;}

        int[][] rightLineXYs  = new int[UpperRightCoordinateXY[1]][2];

        for (int i = 0; i <UpperRightCoordinateXY[1]; i++) {
            rightLineXYs[i][0] = UpperRightCoordinateXY[1];
            rightLineXYs[i][1] = i;}


        System.out.println(ArrayUtils.addAll(first, second));
        return bottomLineXYs;
                //+topLineXYs+leftLineXYs+rightLineXYs;
    }

    public void SetBoundaryAllCoordinatesXYs(int[][] pXYs) {
    }

    public int[][] getBoundaryAllCoordinatesXYs() {
        return new int[][]{{,}};
    }

}
