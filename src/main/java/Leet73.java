import java.util.*;

public class Leet73 {

    /*73. Set Matrix Zeroes */

    public static void main(String[] args) {
        int[][] ints = cal(new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}});
    }

    private static int[][] cal(int[][] inp) {
        List<String> s = new ArrayList<>();

        for (int i = 0; i < inp.length; i++) {
            for (int j = 0; j < inp[0].length; j++) {
                if (inp[i][j] == 0) {
                    s.add(i + "," + j);
                }
            }
        }

        /*
         * 00 01 02 03
         * 10 11 12 13
         * 20 21 22 23
         * */

        for (String each : s) {
            String[] spl = each.split(",");
            int row = Integer.parseInt(spl[0]);
            int col = Integer.parseInt(spl[1]);

            // row = 1, col = 2, length = 4
            for (int i = 0; i < inp[0].length; i++) {
                inp[row][i] = 0;
            }

            for (int i = 0; i < inp.length; i++) {
                inp[i][col] = 0;
            }
        }

        return inp;

    }

}
