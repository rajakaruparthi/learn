import java.util.*;

public class LetterCombinationOfPhoneNumber {

    public static void main(String[] args) {
        System.out.println(combination(""));
    }

    private static List<String> combination(String digits) {
        if(digits.isEmpty()) {
            return Collections.emptyList();
        }
        Map<String, List<Character>> inp = new HashMap<String, List<Character>>();

        inp.put("2", Arrays.asList('a', 'b', 'c'));
        inp.put("3", Arrays.asList('d', 'e', 'f'));
        inp.put("4", Arrays.asList('g', 'h', 'i'));
        inp.put("5", Arrays.asList('j', 'k', 'l'));
        inp.put("6", Arrays.asList('m', 'n', 'o'));
        inp.put("7", Arrays.asList('p', 'q', 'r', 's'));
        inp.put("8", Arrays.asList('t', 'u', 'v'));
        inp.put("9", Arrays.asList('w', 'x', 'y', 'z'));
        List<String> out = new ArrayList<String>();

        List<Character> chars = inp.get(String.valueOf(digits.charAt(0)));
        if (digits.length() > 1) {
            for (Character aChar : chars) {
                out.add(String.valueOf(aChar));
            }
        }

        for (int i = 1; i < digits.length(); i++) {
            List<Character> characters = inp.get(String.valueOf(digits.charAt(i)));
            List<String> out1 = out;
            out = new ArrayList<String>();
            for (String value : out1) {
                for (Character ch : characters) {
                    String s1 = String.valueOf(ch);
                    out.add(value + s1);
                }
            }
        }

        return out;
    }

}
