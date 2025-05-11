public class Leet1957 {

    public static void main(String[] args) {
        cal("leeetcode");
        cal("aaabaaaa");
        cal("aab");
    }

    private static String cal(String inp) {

        int l = 0;
        int r = 1;
        StringBuilder sb = new StringBuilder(String.valueOf(inp.charAt(l)));
        String re = "";
        while (r < inp.length()) {
            if (inp.charAt(l) == inp.charAt(r)) {
                re = String.valueOf((inp.charAt(r)));
                r++;
            } else {
                re = String.valueOf((inp.charAt(r)));
                l = r;
                r++;
            }

            if (r - l < 3) {
                sb.append(re);
            }
        }

        System.out.println(sb.toString());
        return null;
    }
}
