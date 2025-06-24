import java.util.Stack;

public class MyQueue {

    Stack<Integer> inStack = new Stack<>();
    Stack<Integer> outStack = new Stack<>();

    // Enqueue
    public void push(int x) {
        inStack.push(x);
    }

    // Dequeue
    public int pop() {
        shiftStacks();
        return outStack.pop();
    }

    // Peek front element
    public int peek() {
        shiftStacks();
        return outStack.peek();
    }

    // Check if empty
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    // Move elements to outStack only when needed
    private void shiftStacks() {
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
    }

    private void printQueue() {
        for (int elem : outStack) {
            System.out.print("  " + elem);
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.push(10);
        q.push(20);
        System.out.println(q.pop()); // 10
        q.push(30);
        System.out.println(q.peek()); // 20
        System.out.println(q.pop()); // 20
        System.out.println(q.empty()); // false
        System.out.println(q.outStack);
        System.out.println(q.inStack);
        q.printQueue();
    }
}
