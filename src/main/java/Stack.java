public class Stack {

    int maxSize;
    int[] stackArray;
    int top;

    private Stack(int s) {
        top = -1;
        maxSize = s;
        stackArray = new int[maxSize];
    }

    private int peek() {
        return this.stackArray[top];
    }

    private void push(int i) {
        if (isFull()) {
            System.out.println("stack is full");
        }
        top = top + 1;
        this.stackArray[top] = i;
    }

    private int pop() {
        return this.stackArray[top--];
    }

    private boolean isFull() {
        return this.stackArray.length == maxSize;
    }

    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
    }
}
