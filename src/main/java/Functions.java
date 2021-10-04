public class Functions {

    static int[] StrArrayToIntArray(String[] pStrArray){

        int[] arrayInt = new int[pStrArray.length];
        System.out.println(pStrArray.length);
        for (int i = 0; i < pStrArray.length; i++) {
            System.out.println(pStrArray[i]);
            arrayInt[i] = Integer.valueOf(pStrArray[i]);
        }
        return arrayInt;
    }
}
