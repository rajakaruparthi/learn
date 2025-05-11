public class MinPartitions {


    public static void main(String[] args) {

        MinPartitions m = new MinPartitions();
        System.out.println(m.minPartitions("32"));
    }

    public int minPartitions(String n) {

        int max = 0;

        for (int i = 0; i < n.length() / 2; i++) {
            int j = Math.max(Integer.parseInt(String.valueOf(n.charAt(i))), Integer.parseInt(String.valueOf(n.charAt(n.length() - 1 - i))));
            if (j > max) {
                max = j;
            }
        }

        return max;

    }
}
