public class NewJewelsInStones {

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        int i = 0;
        for (char e : stones.toCharArray()) {
            if (jewels.indexOf(e) > -1) {
                i++;
            }
        }
        return i;
    }
}
