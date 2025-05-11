package leetcode75;

import java.util.Stack;

public class DecodeString394 {

    public static void main(String[] args) {
        DecodeString394 decodeString394 = new DecodeString394();
        String out = decodeString394.decodeString("3[a2[c]]");
        System.out.println(out);
    }

    public String decodeString(String s) {
        char[] inp = s.toCharArray();

        Stack<Character> s1 = new Stack<>();
        StringBuilder sb;
        StringBuilder finalOut = new StringBuilder();
        int count = 0;

        for (int i = inp.length - 1; i > 0; i--) {
            s1.push(inp[i]);
            if (inp[i] == '[') {
                sb = new StringBuilder();
                count = Character.getNumericValue(inp[i - 1]);
                while (s1.peek() != ']') {

                }
                for (int k = 0; k < count; k++) {

                }
            }

        }

        for (char c : inp) {

            if (c != ']') {
                s1.push(c);
            }

            if (c == ']') {
                sb = new StringBuilder();

                while (s1.peek() != '[') {
                    sb.insert(0, s1.pop());
                }

                if (s1.peek() == '[') {
                    s1.pop();
                    count = Character.getNumericValue(s1.peek());
                    s1.pop();
                }

                String s2 = sb.toString();
                for (int i = 0; i < count - 1; i++) {
                    sb.append(s2);
                }
                finalOut.append(sb);
            }
        }

        return finalOut.toString();
    }

}
