public class BinaryTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.right = new Node(4);
        root.right.left = new Node(6);
        root.left.left = new Node(5);

        int val = 30;

        boolean res = searchDfs(root, val);
        System.out.println(res);
    }

    private static boolean searchDfs(Node root, int val) {

        if (root == null) {
            return false;
        }

        System.out.println(root.data);

        if (root.data == val) {
            return true;
        }

        boolean leftSearch = searchDfs(root.left, val);
        boolean rightSearch = searchDfs(root.right, val);

        return leftSearch || rightSearch;
    }
}


class Node {

    Node left, right;
    int data;

    Node(int a) {
        this.data = a;
        left = right = null;
    }
}
