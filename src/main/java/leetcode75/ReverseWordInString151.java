package leetcode75;

public class ReverseWordInString151 {


    public String reverseWords(String s) {
        String[] ary = s.split(" ");
        return reverse(ary);
    }

    private String reverse(String[] ary) {
        StringBuilder sb = new StringBuilder();
        for (int i = ary.length - 1; i >= 0; i--) {
            if (!ary[i].equals("")) {
                sb.append(ary[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {

    }
}
