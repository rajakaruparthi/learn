package leetcode75;

public class ConvertToBase7 {

    public String convertToBase7(int num) {
        //
        int rem = 0;
        String s = "";
        boolean neg = false;

        if (num < 0) {
            neg = true;
            num = num * -1;
        }

        while (num > 0) {
            rem = num % 7;
            num = num / 7;
            s = rem + s;
        }

        if (neg) {
            s = STR."-\{s}";
        }

        return s;
    }


    public static void main(String[] args) {
        ConvertToBase7 convertToBase7 = new ConvertToBase7();
        String s = convertToBase7.convertToBase7(100);
        System.out.println(s);
        s = convertToBase7.convertToBase7(-7);
        System.out.println(s);
    }
}
