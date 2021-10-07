public class Functions {

    static int[] StrArrayToIntArray(String[] pStrArray){

        int[] arrayInt = new int[pStrArray.length];
        for (int i = 0; i < pStrArray.length; i++) {
            arrayInt[i] = Integer.valueOf(pStrArray[i]);
        }
        return arrayInt;
    }

    static String [][] AddRightToTheLeft(String[][] pArray, String[] pElement){

        String[][] newArray = new String[pArray.length+1][3];

        for (int i = 0; i < pArray.length; i++) {
            newArray[i] = pArray[i];
        }
        newArray[pArray.length] = pElement;
        return newArray;
    }
}
