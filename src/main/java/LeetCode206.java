public class LeetCode206 {

    public static void main(String[] args) {
        Ln ln = new Ln(10);
        ln.next = new Ln(10);
    }


    private Ln reverse(Ln listNode) {
        Ln prev = null, curr = listNode;
        Ln temp = null;
        while (curr != null) {
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }


}



class Ln {
    int val;
    Ln next;

    Ln() {
    }

    Ln(int val) {
        this.val = val;
    }

    Ln(int val, Ln next) {
        this.val = val;
        this.next = next;
    }
}
