public class Leet53 {


    private int sum(int[] ary) {
        int l = 0;
        int r = ary.length - 1;
        int maxSum = ary[0];
        int currentSum = 0;

        for (int each : ary) {
            if(currentSum < 0) {
                currentSum = 0;
            }
            currentSum += each;
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;

    }
}
