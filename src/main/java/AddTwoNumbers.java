public class AddTwoNumbers {

    static class ListNode {

        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public ListNode() {}

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(0));
        l1.next = new ListNode(2, new ListNode((3)));

        compute(l1, l1);

        /*addToListNode(l1, 2);

        while(l1 != null) {
            System.out.println(l1.val);
            l1 = l1.next;
        }*/

    }

    private static ListNode compute(ListNode l1, ListNode l2) {
        ListNode output = null;
        ListNode temp = null;

        int remainder = 0;

        while (l1 != null || l2 != null) {

            int sum = remainder;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode node = new ListNode(sum % 10);

            remainder = sum / 10;

            if(temp == null) {
                temp = output = node;
            } else {
                temp.next = node;
                temp = temp.next;
            }

            if (remainder > 0) {
                temp.next = new ListNode(remainder);
            }
        }

        return output;
    }

    /*private static ListNode addToListNode(ListNode l, int val) {

        while (l != null) {
            l = l.next;
        }

        ListNode node = new ListNode(val);

    }
*/
    // 9 --> 2 --> 3
    // 2 --> 3 --> 4
    //out :  1 --> 6 --> 7
    // SingleLinkedList

}