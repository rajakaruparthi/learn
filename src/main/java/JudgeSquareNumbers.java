public class JudgeSquareNumbers {

    public static void main(String[] args) {

        System.out.println(judge(2147483600));
    }

    private static boolean judge(int num) {

        int min = 0;
        int max = (int) Math.sqrt(num);


        while (min <= max) {
            int sq = min * min + max * max;
            if (sq == num) {
                return true;
            }

            if (sq < num) {
                min++;
            } else {
                max--;
            }

        }
        return false;

    }
}
