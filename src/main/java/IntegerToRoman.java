import java.util.Hashtable;

public class IntegerToRoman {

    private static Hashtable<Integer, String> map = null;

    public static void setMap() {
        map = new Hashtable<Integer, String>();
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
    }

    public static String intToRoman(int num) {
        setMap();
        StringBuilder sb = new StringBuilder("");
        int rem = num % 1000;

        if (num > 1000) {
            append(sb, 1000, num / 1000);
        }

        if (rem > 500) {
            rem = rem % 500;
            append(sb, 500, 1);
        }

        if (rem > 100) {
            append(sb, 100, rem / 100);
            rem = rem % 100;
        }

        if (rem > 50) {
            append(sb, 50, 1);
            rem = rem % 50;
        }

        if (rem > 10) {
            append(sb, 10, rem / 10);
            rem = rem % 10;
        }

        if (rem > 5) {
            append(sb, 5, 1);
            rem = rem % 5;
        }

        if (rem > 0) {
            append(sb, 1, rem);
        }

        return sb.toString();
    }

    private static void append(StringBuilder e, int type, int count) {
        String s = map.get(type);
        for (int i = 0; i < count; i++) {
            e.append(s);
        }
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
}
