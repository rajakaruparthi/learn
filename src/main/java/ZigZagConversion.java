import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZigZagConversion {


    private String convert(String s, int numRows) {

        StringBuilder out = new StringBuilder();

        int upwardCount = 0, downwardCount = 0;

        List<String> output = new ArrayList<>();

        char[] outputAry = new char[s.length()];

        boolean upwards = false;

        if (numRows >= 3) {

            for (int i = 0; i < s.length(); i++) {

                if (downwardCount < numRows && !upwards) {
                    int key = downwardCount % numRows;
                    String s1 = "";
                    if (output.size() > key) {
                        s1 = output.get(key);
                    }
                    append(s1, key, s, i, output);
                    downwardCount++;
                    upwardCount = numRows - 2;
                } else {
                    upwards = true;
                }

                if (upwards && upwardCount > 0) {
                    int key = upwardCount;
                    String s1 = "";
                    if (output.size() > key) {
                        s1 = output.get(key);
                    }
                    append(s1, key, s, i, output);
                    upwardCount--;
                    downwardCount = 0;
                    if (upwardCount == 0) {
                        upwards = false;
                    }

                }


            }
        } else if (numRows == 1) {
            return s;
        } else if (numRows == 2) {
            if (s.length() % 2 == 0) {
                for (int i = 0; i < s.length() / 2; i++) {
                    outputAry[i] = s.charAt(i * 2);
                    int index = s.length() / 2 + i;
                    outputAry[index] = s.charAt(i * 2 + 1);
                }
            } else {
                for (int i = 0; i < (s.length() + 1) / 2; i++) {
                    outputAry[i] = s.charAt(i * 2);
                    if( i* 2 + 1 < s.length()) {
                        int index = (s.length()+1) / 2 + i;
                        outputAry[index] = s.charAt(i * 2 + 1);
                    }
                }
            }
            return toString(outputAry);
        }

        for (String each : output) {
            out.append(each);
        }

        return out.toString();
    }

    private String toString(char[] outputAry) {
        StringBuilder s = new StringBuilder();
        for (char c : outputAry) {
            s.append(c);
        }
        return s.toString();
    }

    private void append(String s1, int key, String s, int i, List<String> output) {
        if (!"".equalsIgnoreCase(s1)) {
            s1 = s1 + s.charAt(i);
            output.set(key, s1);
        } else {
            s1 = "" + s.charAt(i);
            output.add(key, s1);
        }
    }

    public static void main(String[] args) {

        ZigZagConversion zigZagConversion = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int rows = 3;
        String out = zigZagConversion.convert(s, rows);
        System.out.println(out);
    }
}
