import java.time.LocalDate;
import java.time.LocalDateTime;

public class Colors {

    public int minCount(String colors, int[] neededTime) {


        int totalTime = 0;

        char[] colorArry = colors.toCharArray();

        if (colorArry.length > 1) {

            int iterations;

            for (int i = 0; i < colorArry.length - 1; i = i + iterations) {

                iterations = 0;

                boolean colorChanged = false;

                int j = i + 1;

                int max = neededTime[i];

                int sum = neededTime[i];

                while (!colorChanged) {

                    if (j < (colorArry.length) && (colorArry[i] == colorArry[j])) {
                        if (neededTime[i] < neededTime[j] && max < neededTime[j]) {
                            max = neededTime[j];
                        }
                        sum = sum + neededTime[j];
                        j++;
                    } else {
                        colorChanged = true;
                    }

                    iterations++;
                }

                sum = sum - max;

                totalTime = totalTime + sum;

            }

            return totalTime;
        }


        return 0;
    }

    public static void main(String[] args) {

        Colors colors = new Colors();
        int count = colors.minCount("acaaaacccc", new int[]{9,3,9,8,8,3,2,7,6,6});
        System.out.println(count);

    }
}
