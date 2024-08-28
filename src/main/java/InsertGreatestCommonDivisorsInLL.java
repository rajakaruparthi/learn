public class InsertGreatestCommonDivisorsInLL {

    public static void main(String[] args) {
        InsertGreatestCommonDivisorsInLL i = new InsertGreatestCommonDivisorsInLL();
        ListNode l = i.insertData();
        i.gcd(10, 6);
        i.insertGreatestCommonDivisors(l);
    }

    class ListNode {

        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }
    }

    private ListNode insertData() {
        ListNode l1 = new ListNode(18);
        ListNode l2 = new ListNode(6);
        ListNode l3 = new ListNode(10);
        ListNode l4 = new ListNode(3);

        l1.next = l2;
        l2.next = l3;
        l3.next = l4;

        return l1;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {

        ListNode prev = head;
        ListNode current = head.next;

        while (current != null) {
            int v = getCommonDivisor(prev.val, current.val);
            prev.next = new ListNode(v, current);
            prev = current;
            current = current.next;
        }

        return head;

    }

    private int getCommonDivisor(int i, int j) {

        int out = 0;
        if (i < j) {
            for (int k = 1; k <= i; k++) {
                if (i % k == 0 && j % k == 0) {
                    out = k;
                }
            }
        } else if (j < i) {
            for (int k = 1; k <= j; k++) {
                if (i % k == 0 && j % k == 0) {
                    out = k;
                }
            }
        } else {
            return i;
        }
        return out;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
