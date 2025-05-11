public class Leet796 {

    public static void main(String[] args) {
        System.out.println(rotateString("aa", "a"));
    }

    private static boolean rotateString(String inp, String goal) {
        return inp.length() == goal.length() && (inp + inp).contains(goal);
    }
}
