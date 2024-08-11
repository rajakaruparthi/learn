public class RotateImage {

    public static void main(String[] args) {
        int[][] ary = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        transpose(ary);
        print(ary);
        horizontalMove(ary);
        print(ary);
    }

    private static void swap(int i, int j, int[][] ary) {
        int temp = ary[i][j];
        ary[i][j] = ary[j][i];
        ary[j][i] = temp;
    }

    private static void swapHorizontally(int i, int j, int[][] ary) {
        int temp = ary[i][j];
        ary[i][j] = ary[i][ary.length - j - 1];
        ary[i][ary.length - j - 1] = temp;
    }

    private static void transpose(int[][] ary) {
        for (int i = 0; i < ary.length; i++) {
            for (int j = i; j < ary.length; j++) {
                swap(i, j, ary);
            }
        }
    }

    private static void horizontalMove(int[][] ary) {
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary.length / 2; j++) {
                swapHorizontally(i, j, ary);
            }
        }
    }

    private static void print(int[][] ary) {
        for (int[] ints : ary) {
            for (int j = 0; j < ary.length; j++) {
                System.out.print(ints[j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
