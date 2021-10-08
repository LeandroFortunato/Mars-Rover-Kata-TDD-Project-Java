public class Functions {

    static int[] StrArrayToIntArray(String[] pStrArray){

        int[] arrayInt = new int[pStrArray.length];
        for (int i = 0; i < pStrArray.length; i++) {
            arrayInt[i] = Integer.valueOf(pStrArray[i]);
        }
        return arrayInt;
    }


}
