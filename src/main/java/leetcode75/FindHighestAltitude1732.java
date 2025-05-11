package leetcode75;

public class FindHighestAltitude1732 {

    public static void main(String[] args) {

        FindHighestAltitude1732 findHighestAltitude1732 = new FindHighestAltitude1732();
        findHighestAltitude1732.largestAltitude(new int[]{-5, 1, 5, 0, -7});
    }


    public int largestAltitude(int[] gain) {

        int left = 0;
        int right;
        int max = 0;

        for (int value : gain) {
            right = value + left;
            System.out.println(right);
            left = right;
            max = Math.max(right, max);
        }

        return max;
    }
}
