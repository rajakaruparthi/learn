//import java.util.HashMap;
//import java.util.Map;
//
//public class CircleFormed {
//
//    public static void main(String[] args) {
//        String[] a = new String[]{"chair", "height", "racket", "touch", "tunic"};
//        CircleFormed circleFormed = new CircleFormed();
//        System.out.println(circleFormed.isCircle(a));
//    }
//
//    private boolean isCircle(String[] a) {
//        Map<String, Integer> chars = new HashMap<>();
//
//        for (String each : a) {
//
//            String start = String.valueOf(each.charAt(0));
//            String end = String.valueOf(each.charAt(each.length() - 1));
//
//            if (chars.containsKey(start)) {
//                chars.put(start, chars.get(start) + 1);
//            } else {
//                chars.put(start, 1);
//            }
//
//            if (chars.containsKey(end)) {
//                chars.put(end, chars.get(end) + 1);
//            } else {
//                chars.put(end, 1);
//            }
//        }
//
//        System.out.println();
//        for (String each : chars.keySet()) {
//            if (chars.get(each) % 2 != 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}
