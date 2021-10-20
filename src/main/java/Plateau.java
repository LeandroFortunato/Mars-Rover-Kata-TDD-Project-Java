import java.util.Arrays;

public class Plateau {

    /*-----------------------------------------*/
    public int[] UpperRightCoordinateXY;
    public int[][] bottomLineXYs;
    public int[][] topLineXYs;
    public int[][] leftLineXYs;
    public int[][] rightLineXYs;
    /*-----------------------------------------*/

    public Plateau(int[] pXY) {

        this.UpperRightCoordinateXY = pXY;

        this.bottomLineXYs = new int[this.UpperRightCoordinateXY[0]][2];
        for (int i = 0; i < this.UpperRightCoordinateXY[0]; i++) {
            this.bottomLineXYs[i][0] = i;
            this.bottomLineXYs[i][1] = 0;
        }

        this.topLineXYs = new int[this.UpperRightCoordinateXY[0]][2];
        for (int i = 0; i < this.UpperRightCoordinateXY[0]; i++) {
            this.topLineXYs[i][0] = i;
            this.topLineXYs[i][1] = this.UpperRightCoordinateXY[0];
        }

        this.leftLineXYs = new int[this.UpperRightCoordinateXY[1]][2];
        for (int i = 0; i < this.UpperRightCoordinateXY[1]; i++) {
            this.leftLineXYs[i][0] = 0;
            this.leftLineXYs[i][1] = i;
        }

        this.rightLineXYs = new int[this.UpperRightCoordinateXY[1]][2];
        for (int i = 0; i < this.UpperRightCoordinateXY[1]; i++) {
            this.rightLineXYs[i][0] = this.UpperRightCoordinateXY[1];
            this.rightLineXYs[i][1] = i;
        }

        System.out.println("Plateau created upon edges : [0, 0] to "
                            +Arrays.toString( UpperRightCoordinateXY));
        System.out.println("South boarder limit coordinates: "+Arrays.deepToString( bottomLineXYs));
        System.out.println("North boarder limit coordinates: "+Arrays.deepToString( topLineXYs));
        System.out.println("West boarder limit coordinates: "+Arrays.deepToString( leftLineXYs));
        System.out.println("East boarder limit coordinates: "+Arrays.deepToString( rightLineXYs));

    }

    public boolean TheIntendedMoveIsOutOfPlateauBoundaries(int pNextPositionX,
                                                             int pNextPositionY) {

        // functionality to be built in the future

    return false;}
}