import java.util.Arrays;

public class Leet62 {



    /*
     * 00 01 02 03
     * 10 11 12 13
     * 20 21 22 23
     * */

    /*
     * 10 6 3 1
     * 4 3 2 1
     * 1 1 1 1
     * */


    public static void main(String[] args) {
        int m = 3, n = 7;
        cal(new int[m][7]);
    }


    private static int cal(int[][] input) {
        int rows = input.length - 1; // 2
        int columns = input[0].length - 1; //3
        int[][] output = new int[rows + 1][columns + 1];

        for (int i = rows; i >= 0; i--) {
            for (int j = columns; j >= 0; j--) {
                //
                if (j == columns || i == rows) {
                    output[i][j] = 1;
                } else {
                    output[i][j] = output[i][j + 1] + output[i + 1][j];
                }
            }
        }
        return output[0][0];
    }
}
