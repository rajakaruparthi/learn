public class Leet3163 {

    public static void main(String[] args) {
        System.out.println(cal("abcde"));
        System.out.println(cal("aaaaaaaaaaaaaabb"));
        System.out.println(cal("aaaaaaaaaaaaaab"));
    }


    private static String cal(String str) {

        int count = 1;
        char[] inp = str.toCharArray();

        StringBuilder sb = new StringBuilder();

        if(inp.length == 1) {
            return sb.append(1).append(str).toString();
        }

        for (int i = 0; i < str.length(); i++) {
            if (i == str.length() - 1) {
                if (str.length() > 1) {
                    if (inp[i] == inp[i - 1]) {
                        sb.append(count).append(inp[i]);
                    } else {
                        count = 1;
                        sb.append(count).append(inp[i]);
                    }
                }
            } else {
                if (inp[i] == inp[i + 1]) {
                    count++;
                    if (count > 9) {
                        sb.append(9).append(inp[i]);
                        count = 1;
                    }
                } else {
                    sb.append(count).append(inp[i]);
                    count = 1;
                }
            }
        }

        return sb.toString();
    }
}
