public class SwapPairs {

    public static ListNode swapPairs(ListNode head) {

        int temp = 0;
        ListNode listNode = new ListNode();

        while (head != null) {
            temp = head.val;
            listNode.next = new ListNode(temp);
            listNode.val = head.next.val;
            listNode.next = new ListNode(temp);
            head = head.next.next;
        }

        printListNode(listNode);

        return listNode;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(10);
        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printListNode((node1));
        swapPairs(node1);
    }

    private static void printListNode(ListNode node1) {

        while(node1 != null) {
            System.out.print(node1.val);
            System.out.print(" ");
            node1 = node1.next;
        }
        System.out.println();
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
