public class RabinKarpAlgorithm {

    public static void main(String[] args) {
        String input = "ababdabc";
        String regex = "abc";
        int substringRegex = constructSubstringRegex(regex);
        String result = removeStrings(input, regex, substringRegex);
        System.out.println(result);
    }

    private static String removeStrings(String input, String regex, int substringRegex) {

        StringBuilder sb = new StringBuilder();
        int calculatedRegexValue = 0;
        int end = regex.length();
        int regexLength = end;

        if (input.length() > regex.length()) {
            calculatedRegexValue = constructSubstringRegex(input.substring(0, end));
        }

        int start = 0;
        boolean done = false;

        if (calculatedRegexValue == substringRegex) {
            done = doCharacterComparison(start, end, input, regex);
        }

        if (!done) {
            sb.append(input.charAt(start));
            start++;
            end++;
        } else {
            start = start + regexLength - 1;
            end = end + regexLength - 1;
        }

        System.out.println(sb);

        while (end < input.length()) {
            calculatedRegexValue = slideAndCalculate(start, end, calculatedRegexValue, regexLength, input);
            if (calculatedRegexValue == substringRegex) {
                done = doCharacterComparison(start + 1, end, input, regex);
            }
            if (!done) {
                sb.append(input.charAt(start));
            } else {
                start = start + regexLength - 1;
                end = end + regexLength - 1;
            }
            start++;
            end++;
        }

        return sb.toString();
    }

    private static boolean doCharacterComparison(int start, int end, String input, String regex) {
        int i = 0;
        while (start < end) {
            if (regex.charAt(++i) != input.charAt(++start)) {
                return false;
            }
        }
        return true;
    }

    private static int slideAndCalculate(int start, int end, int calculatedValue, int regexLength, String input) {
        return (int) ((calculatedValue - Math.pow(10, regexLength - 1) * (int) input.charAt(start)) * 10 + (int) input.charAt(end));
    }

    static int constructSubstringRegex(String str2) {
        int sum = 0;
        int each = 0;
        for (int i = 0; i < str2.length(); i++) {
            int multiplier = (int) Math.pow(10, (str2.length() - 1 - i));
            int ascii = (int) str2.charAt(i);
            System.out.println(multiplier + "==" + ascii);
            each = ascii * multiplier;
            sum = sum + each;
        }
        return sum;
    }
}
