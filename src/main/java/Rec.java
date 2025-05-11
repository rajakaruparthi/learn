import java.util.Arrays;
import java.util.List;

public record Rec(int a, int b, List<String> strs) {
    public Rec {
        // to create unmodifiable list of strs
        strs = List.copyOf(strs);
        if (a < b) {
            a = 2;
        }
    }
}

class Temp {
    public static void main(String[] args) {
        Rec r = new Rec(1, 2, Arrays.asList("Raja", "pat"));
        System.out.println(r);

        StringBuilder sb = new StringBuilder();
        String s = "aaaabbbcd";
        char[] charArray = s.toCharArray();
        int c = 1;
        for (int i = 0; i < charArray.length - 1; i++) {
            if (charArray[i] == charArray[i + 1]) {
                c++;
            } else {
                sb.append(c).append(charArray[i]);
                c = 1;
            }

            if (i + 1 == s.length() - 1) {
                sb.append(c).append(charArray[i + 1]);
            }
        }

        System.out.println(sb.toString());
        System.out.println((int) 'a');
    }


}

