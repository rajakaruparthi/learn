public class BinarySearch {

    public static void main(String[] args) {

        int[] ary = {2,5};

        int target = 0;

        //System.out.println(search(ary, target));
        System.out.println(searchNumberLogn(ary, target));
        System.out.println();
    }

    public static int search(int[] ary, int target) {
        return searchNum(ary, 0, ary.length - 1, target);
    }


    private static int searchNum(int[] ary, int min, int max, int target) {
        while (min != max) {
            int mid = (min + max) / 2;
            if (ary[mid] == target) {
                return mid;
            }

            if (ary[mid] > target) {
                max = mid;
                searchNum(ary, min, mid, target);
            } else {
                min = mid;
                searchNum(ary, mid, max, target);
            }
        }
        return 0;
    }

    private static int searchNumberLogn(int[] ary, int target) {

        int max = ary.length - 1;
        int min = 0;

        if (ary.length == 1) {
            return target == ary[0] ? 0 : -1;
        }

        while (min != max) {
            int mid = (min + max) / 2;
            if (ary[mid] == target) {
                return mid;
            } else {
                if (max - mid == 1) {
                    if (ary[max] == target) {
                        return max;
                    } else if (ary[min] == target) {
                        return min;
                    } else {
                        return -1;
                    }
                }

                if (ary[mid] > target) {
                    max = mid;
                } else {
                    min = mid;
                }


            }
        }
        return 0;
    }

}
