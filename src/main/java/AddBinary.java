public class AddBinary {

    public static void main(String[] args) {
        addBinary("10101", "1010");
        addBinary("11", "1");
        addBinary("1010", "1011");
    }

    public static String addBinary(String a, String b) {
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;

        String s = "";
        char a1 = '0', b1 = '0', c1 = '0';

        while (l1 >= 0 || l2 >= 0) {

            if (l1 < 0) {
                a1 = '0';
            } else {
                a1 = a.charAt(l1);
            }

            if (l2 < 0) {
                b1 = '0';
            } else {
                b1 = b.charAt(l2);
            }

            l1--;
            l2--;

            int calculate = calculate(a1, b1, c1);

            if (calculate == 2) {
                s = 0 + s;
                c1 = '1';
            } else if (calculate == 3) {
                s = 1 + s;
                c1 = '1';
            } else {
                s = calculate + s;
                c1 = '0';
            }
        }
        if (c1 == '1') {
            s = 1 + s;
        }

        System.out.println(s);
        return s;
    }

    private static int calculate(char a, char b, char carry) {
        int a1 = Character.getNumericValue(a);
        int a2 = Character.getNumericValue(b);
        int a3 = Character.getNumericValue(carry);
        return a1 + a2 + a3;
    }
}
