public class DiffBetweenMaxAndMinAvg {

    public static void main(String[] args) {
        DiffBetweenMaxAndMinAvg diffBetweenMaxAndMinAvg = new DiffBetweenMaxAndMinAvg();
        System.out.println(diffBetweenMaxAndMinAvg.diffBetMaxAndMin(new int[]{3, 8, 9, 15}, 2));
    }

    private float diffBetMaxAndMin(int[] ary, int k) {
        int sum = 0;
        float minAvg = ary[ary.length - 1];
        float maxAvg = 0;
        float avg = 0;
        int start = 0;

        for (int i = 0; i < ary.length; i++) {
            sum = sum + ary[i];
            if (i - start + 1 == k) {
                avg = (float) sum / k;
                minAvg = Math.min(minAvg, avg);
                maxAvg = Math.max(maxAvg, avg);
                sum -= ary[start];
                start = i - k + 2;
            }
        }
        return maxAvg - minAvg;
    }
}
