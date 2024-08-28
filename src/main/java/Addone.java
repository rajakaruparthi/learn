public class Addone {

    public static void main(String[] args) {
//        merge(new int[]{9, 9, 9});
//        int[] ints = merge(new int[]{1, 2, 3});
//        int[] ints = merge(new int[]{4,3,2,1});
        int[] ints = merge(new int[]{9, 9});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int[] merge(int[] input) {

        int carry = 1;
        int[] out;

        if (input.length == 1) {
            if (input[0] == 9) {
                return new int[]{1, 0};
            } else {
                return new int[]{input[0] + 1};
            }
        }

        for (int i = input.length - 1; i >= 0; i--) {
            input[i] = input[i] + carry;
            if (input[i] == 10) {
                carry = 1;
                input[i] = 0;
            } else {
                carry = 0;
            }
        }

        if (carry == 1) {
            out = new int[input.length + 1];
            out[0] = 1;
            if (input.length - 1 >= 0) System.arraycopy(input, 0, out, 1, input.length - 1);
            return out;
        }

        return input;
    }
}


