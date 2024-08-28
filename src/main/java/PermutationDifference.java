public class PermutationDifference {

    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc", "bac"));
    }

    public static int findPermutationDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int diff = (i - t.indexOf(c));
            diff = diff < 0 ? -diff : diff;
            System.out.println(diff);
            sum = diff + sum;
        }

        return sum;
    }
}
