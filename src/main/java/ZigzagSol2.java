public class ZigzagSol2 {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int diff = 2 * (numRows - 1);

        for (int i = 0; i < numRows; i++) {
            int index = i;
            int diagonalDiff = diff - 2 * i;

             while (index < n) {
                ans.append(s.charAt(index));
                if (i != 0 && i != numRows - 1) {
                    int diagonalIndex = index + diagonalDiff;

                    if (diagonalIndex < n)
                        ans.append(s.charAt(diagonalIndex));
                }
                index += diff;
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {

        ZigzagSol2 zigZagConversion = new ZigzagSol2();
        String s = "PAYPALISHIRING";
        int rows = 3;
        String out = zigZagConversion.convert(s, rows);
        System.out.println(out);
    }

}
