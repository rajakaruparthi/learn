public class Leet2914 {

    public static void main(String[] args) {
        System.out.println(cal("1001"));
        System.out.println(cal("10"));
    }

    private static int cal(String s) {
        int l = 0;
        int r = s.length() - 1;
        char[] inp = s.toCharArray();
        int switchCount = 0;

        for (int i = 0; i < inp.length; ) {
            if (inp[i] != inp[i + 1]) {
                switchCount++;
            }
            i = i + 2;
        }
        return switchCount;

    }
}
