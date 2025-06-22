import java.util.LinkedList;
import java.util.Queue;

public class StackWithTwoQueues {

    Queue<Integer> q1 = new LinkedList();
    Queue<Integer> q2 = new LinkedList();

    public void push(int x) {
        q2.add(x);

        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    public int top() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return q1.peek();
    }

    public int pop() {
        if (q1.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return q1.remove();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    public void print() {
        for (Integer integer : q1) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackWithTwoQueues stack = new StackWithTwoQueues();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println("Top: " + stack.top()); // 30
        System.out.println("Pop: " + stack.pop()); // 30
        System.out.println("Top: " + stack.top()); // 20
        System.out.println("Empty? " + stack.empty()); // false
    }
}
