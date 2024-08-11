public class FirstOccurance28 {

    public static void main(String[] args) {
        System.out.println(firstOccurance("sadbutsad", "sad"));
    }

    private static int firstOccurance(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        return haystack.indexOf(needle);
    }
}
