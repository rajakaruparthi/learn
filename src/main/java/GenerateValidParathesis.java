import java.util.ArrayList;
import java.util.List;

public class GenerateValidParathesis {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> output = new ArrayList<String>();
        backTrack(output, "", 0, 0, n);
        return output;
    }

    private static void backTrack(List<String> output, String each, int open, int close, int max) {

        if (each.length() == max * 2) {
            output.add(each);
            return;
        }

        if (open < max) {
            backTrack(output, each + "(", open + 1, close, max);
        }

        if (close < open) {
            backTrack(output, each + ')', open, close + 1, max);
        }
    }


}


// 2
// (()), ()()