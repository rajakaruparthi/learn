public class MyAtoi {


    private int myAtoi(String s) {

        StringBuilder sb = new StringBuilder();

        boolean negative = false;

        int e1 = 0;

        char[] toCharArray = s.toCharArray();

        for (int i = 0; i < toCharArray.length; i++) {
            try {
                sb.append(Integer.parseInt(String.valueOf(toCharArray[i])));
            } catch (Exception ex) {
                if (String.valueOf(toCharArray[i]).equalsIgnoreCase("-")) {
                    e1++;
                    negative = true;
                    if (i > 1) {
                        break;
                    }
                } else if (String.valueOf(toCharArray[i]).equalsIgnoreCase("+")) {
                    e1++;
                    negative = false;
                } else if (!String.valueOf(toCharArray[i]).equalsIgnoreCase(" ")) {
                    break;
                }
            }
        }

        if (sb.toString().

                equals("")) {
            return 0;
        }

        if (e1 >= 2) {
            return 0;
        }

        try {
            int abs = Math.abs(Integer.parseInt(sb.toString()));
            return !negative ? abs : Math.negateExact(abs);
        } catch (
                Exception ex) {
            if (negative) {
                return -2147483648;
            } else {
                return 2147483647;
            }
        }

    }

    public static void main(String[] args) {
        MyAtoi myAtoi = new MyAtoi();
        String inp = "00000-42a1234";
        int res = myAtoi.myAtoi(inp);
        System.out.println(res);
    }
}
