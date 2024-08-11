public class Palindrome {

    public static void main(String[] args) {

        Palindrome p = new Palindrome();
        boolean out = p.isPalindrome(121);
        System.out.println(out);
    }

    private boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        } else {

            int pal = 1;
            int i = 0;

            try {
                while (num > 0) {
                    pal = num / 10;
                    pal = pal + pal * 10 ^ i;
                    num = num / 10;
                }
                System.out.println(pal);
            } catch (Exception ex) {
                return false;
            }
        }
        return true;


    }
}
