package bg.smg;

import java.util.Arrays;

public class Util {
    public static void main(String[] args) {
        String s = "23 4 5 1 8 0 9 456";
        Arrays.stream(getNumberValues(s)).forEach(e -> System.out.print(e+" "));
    }

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

    public static char getOperation(String s){
        switch (s) {
            case "+" : return '+';
            case "-" : return '-';
            case "/" : return '/';
            case "*" : return '*';
        }
        throw new UnsupportedOperationException("String is not supported operation");
    }

}
