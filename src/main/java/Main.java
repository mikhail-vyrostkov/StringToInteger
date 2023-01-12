import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(Solution.myAtoi(s));
    }

    public static class Solution {
        public static int myAtoi(String str) {
            // Runtime = 9 ms; Memory = 43 MB
            // method for finding a number in a string
            str = str.trim();
            if ( str.length() < 1)
                return 0;

            char flag = '+';
            int i = 0;
            if (str.charAt(0) == '-') {
                flag = '-';
                i++;
            } else if (str.charAt(0) == '+') {
                i++;
            }
            double result = 0;
            String newS = "";
            while (str.length() > i && Character.isDigit(str.charAt(i))) {
                newS = newS  + str.charAt(i);
                i++;
            }
            if (!newS.equals("")) {
                result = Double.parseDouble(newS);
            }
            if (flag == '-')
                result = -result;
            if (result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            return (int) result;
        }


//            int a = 0;
//            Pattern pat=Pattern.compile("(^[-+\\d]*)");
//            Matcher matcher=pat.matcher(s);
//            while (matcher.find()) {
//                if (matcher.group().equals("")){
//                    return 0;
//                }else {
//                    float value = Float.parseFloat(matcher.group());
//                    if (value > Integer.MAX_VALUE) {
//                        a = Integer.MAX_VALUE;
//                    }else if (value < Integer.MIN_VALUE) {
//                        a = Integer.MIN_VALUE;
//                    }else {
//                        a = Integer.parseInt(matcher.group());
//                    }
//                }
//            }
//            return a;


//            String newS = "";
//            if (s.replaceAll("\\d", "").length() == s.length()) {
//                return 0;
//            }
//            char[] sArr = s.toCharArray();
//            for (int i = 0; i < sArr.length; i++) {
//                if (sArr[i] == ' ') {
//                    newS = newS + "";
//                } else if (sArr[i] == '-') {
//                    newS = newS + "-";
//                    if ((i != sArr.length -1) && !Character.isDigit(sArr[i+1])){
//                        newS = "0";
//                        break;
//                    }
//                } else if (sArr[i] == '+') {
//                    newS = newS + "+";
//                    if ((i != sArr.length -1) && !Character.isDigit(sArr[i+1])){
//                        newS = "0";
//                        break;
//                    }
//                } else if (Character.isDigit(sArr[i])) {
//                    newS = newS + sArr[i];
//                    if ((i != sArr.length -1) && !Character.isDigit(sArr[i + 1])){
//                        break;
//                    }
//                } else {
//                    if (newS.isEmpty()) {
//                        newS = "0";
//                        break;
//                    }
//                    newS = newS + "";
//                    break;
//                }
//            }
//            long value = Long.parseLong(newS);
//            System.out.println(value);
//            if (value > Integer.MAX_VALUE){
//                return Integer.MAX_VALUE;
//            }
//            if (value < Integer.MIN_VALUE){
//                return Integer.MIN_VALUE;
//            }
//            return 7;
//        }
    }
}
