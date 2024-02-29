public class ReverseInteger {

    private int reverse(int x) {

        int output = 0;


        if(x == 0) {
            return 0;
        }

        StringBuilder out = new StringBuilder();
        boolean negativeNum = false;

        if (x < 0) {
            negativeNum = true;
            x = Math.abs(x);
        }

        while (x > 0) {
            int a = x % 10;
            out.append(a);
            x = x / 10;
        }

        try {
            output  = negativeNum ? Math.negateExact(Integer.parseInt(out.toString())) : Integer.parseInt(out.toString());
        } catch (Exception ex) {
            return 0;
        }

        return output;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println(reverseInteger.reverse(+1));
    }
}
