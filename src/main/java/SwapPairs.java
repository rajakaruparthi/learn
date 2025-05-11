public class SwapPairs {

    public static Ln swapPairs(Ln head) {

        int temp = 0;
        Ln listNode = new Ln();

        while (head != null) {
            temp = head.val;
            listNode.next = new Ln(temp);
            listNode.val = head.next.val;
            listNode.next = new Ln(temp);
            head = head.next.next;
        }

        printListNode(listNode);

        return listNode;
    }

    public static void main(String[] args) {
        Ln node1 = new Ln(10);
        Ln node2 = new Ln(20);
        Ln node3 = new Ln(30);
        Ln node4 = new Ln(40);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        printListNode((node1));
        swapPairs(node1);
    }

    private static void printListNode(Ln node1) {

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
    Ln next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, Ln next) {
        this.val = val;
        this.next = next;
    }
}
