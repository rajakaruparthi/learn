public class Challenge {

    /**
     * A sandwich is two pieces of bread with something in between. Return the string that is between
     * the first and last appearance of "bread" in the given string, or return the empty string ""
     * if there are not two pieces of bread.
     * Examples
     *     getSandwich("breadjambread") → "jam"
     *     getSandwich("xxbreadjambreadyy") → "jam"
     *      getSandwich("xxbreadapplebreadyy") → "apple"
     *     getSandwich("xxbreadyy") → ""
     *
     *
     */

    String getSandwich(String input) {
        String[] breads = input.split("bread");
        int i1 = input.indexOf("bread");
        input.lastIndexOf("bread");
        return "";
    }

    public static void main(String[] args) {

        Challenge c = new Challenge();
        c.getSandwich("xxbreadapplebreadyy");

    }
}
