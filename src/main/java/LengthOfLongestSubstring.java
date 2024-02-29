public class LengthOfLongestSubstring {


    public int lengthOfLongestSubstring(String s) {

        boolean repeated = false;

        StringBuilder sb;

        int j = 0;

        int max = 0;


        for (int i = 0; i < s.length(); i++) {

            sb = new StringBuilder();

            j = i;

            while (j < s.length() && !repeated) {

                if (sb.toString().contains(String.valueOf(s.charAt(j)))) {
                    repeated = true;
                } else {
                    sb.append(s.charAt(j));
                    j++;
                }
                if(max < sb.length()) {
                    max = sb.length();
                }
            }

            System.out.println(sb.toString());

            repeated = false;

        }
        return max;
    }

    public static void main(String[] args) {
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int max = lengthOfLongestSubstring.lengthOfLongestSubstring("dvdf");
        System.out.println(max);
    }
}

