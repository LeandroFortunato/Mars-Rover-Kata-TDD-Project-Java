import java.util.Arrays;
import java.util.ArrayList;

public class Plateau {

/*-----------------------------------------*/
    public int[] UpperRightCoordinateXY;
    public int[][] bottomLineXYs;
    public int[][] topLineXYs;
    public int[][] leftLineXYs;
    public int[][] rightLineXYs;

    //public int[][] BoundaryAllCoordinatesXYs;
/*-----------------------------------------*/

    public Plateau (int[] pXY){
        this.UpperRightCoordinateXY = pXY;
    }

    public boolean CalculateBoundariesXYs() {

        bottomLineXYs  = new int[UpperRightCoordinateXY[0]][2];
        for (int i = 0; i <UpperRightCoordinateXY[0]; i++) {
            bottomLineXYs[i][0] = i;
            bottomLineXYs[i][1] = 0;
        }

        topLineXYs  = new int[UpperRightCoordinateXY[0]][2];
        for (int i = 0; i <UpperRightCoordinateXY[0]; i++) {
            topLineXYs[i][0] = i;
            topLineXYs[i][1] = UpperRightCoordinateXY[0];}

        leftLineXYs  = new int[UpperRightCoordinateXY[1]][2];
        for (int i = 0; i <UpperRightCoordinateXY[1]; i++) {
            leftLineXYs[i][0] = 0;
            leftLineXYs[i][1] = i;}

        rightLineXYs  = new int[UpperRightCoordinateXY[1]][2];
        for (int i = 0; i <UpperRightCoordinateXY[1]; i++) {
            rightLineXYs[i][0] = UpperRightCoordinateXY[1];
            rightLineXYs[i][1] = i;}

        /* --------------- to be removed ---------------*/
        System.out.println(Arrays.deepToString(bottomLineXYs));
        System.out.println(Arrays.deepToString(topLineXYs));
        System.out.println(Arrays.deepToString(leftLineXYs));
        System.out.println(Arrays.deepToString(rightLineXYs));
        /* --------------- to be removed ---------------*/

        return true;

    }

    public void SetBoundaryAllCoordinatesXYs(int[][] pXYs) {
    }

    public int[][] getBoundaryAllCoordinatesXYs() {
        return new int[][]{{,}};
    }

}
