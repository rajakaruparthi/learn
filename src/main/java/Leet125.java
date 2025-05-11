public class Leet125 {

    public static void main(String[] args) {
//        boolean valid = isValid("A man, a plan, a canal: Panama");
//        System.out.println(valid);
//        System.out.println(isValid("race a car"));
        System.out.println(isValid("0P"));
    }


    private static boolean isValid(String s) {
        if (s.length() == 1) {
            return true;
        }
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            int lC = s.charAt(l);
            int rc = s.charAt(r);

            if (Character.isLetterOrDigit(s.charAt(l))) {
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))) {
                r--;
            } else if (lC != rc) {
                return false;
            } else {
                l++;
                r--;
            }
        }

        return true;
    }
}
