public class ContinousSubArraySum {


    public static void main(String[] args) {
        boolean f = find(new int[]{23, 2, 4, 6, 7}, 6);
        boolean f2 = find(new int[]{23,2,6,4,7}, 6);
        boolean f3 = find(new int[]{23,2,6,4,7}, 13);
        System.out.println(f);
        System.out.println(f2);
        System.out.println(f3);
    }

    private static boolean find(int[] inp, int k) {
        int left = 0;
        int right = 0;
        int sum = 0;

        while (right < inp.length) {
            sum += inp[right];
            if (sum == k) {
                return true;
            }
            if (sum < k) {
                right++;
            } else {
                if (left == right) {
                    sum = sum - inp[left];
                    if(sum == k) {
                        return true;
                    }
                    left++;
                    right++;
                } else {
                    while (sum > k && left < right) {
                        sum = sum - inp[left];
                        if(sum == k) {
                            return true;
                        }
                        left++;
                    }
                }
            }
        }

        return false;
    }
}
