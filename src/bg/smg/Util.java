package bg.smg;

public class Util {

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static int[] getNumberValues(String s) {
        String[] sl = s.split(" ");
        int[] result = new int[sl.length];
        for(int i =0;i<sl.length;i++) {
            try {
                result[i] = Integer.parseInt(sl[i]);
            } catch (NumberFormatException е) {
                //not a number: добавете логика какво правите с елементите, които не са числа тук:
            }
        }
        return result;
    }

}
