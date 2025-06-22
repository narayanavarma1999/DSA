import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    // Push element onto stack
    public void push(int x) {
        // Step 1: Add to q2
        q2.add(x);

        // Step 2: Move all from q1 to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Step 3: Swap q1 and q2
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        System.out.println(q1);
    }

    // Pop element from stack
    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.remove();
    }

    // Get top element
    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    // Check if stack is empty
    public boolean empty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.top()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Top: " + stack.top()); // 20
        System.out.println("Empty? " + stack.empty()); // false
    }
}
