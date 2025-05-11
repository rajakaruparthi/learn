import java.util.Stack;

public class Leet2390 {

    public static void main(String[] args) {
        String s = removeStars("leet**co*e");
        System.out.println(s);
    }

    private static String removeStars(String s) {

        StringBuilder sb = new StringBuilder();
        int r = 0;

        int count = 0;
        // leet**co*e
        // l == 0, r == 6

        Stack<Character> stack = new Stack<>();
        while (r < s.length()) {
            if (!stack.isEmpty() && s.charAt(r) == '*') {
                stack.pop();
            } else {
                stack.push(s.charAt(r));
            }
            r++;
        }

        stack.forEach(sb::append);

        return sb.toString();
    }
}
