import java.util.Stack;

public class QueuesWithStack {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int x) {
        stack2.push(x);
        while (!stack1.empty()) {
            stack1.push(stack2.pop());
        }
        Stack temp = stack1;
        stack1 = stack2;
        stack2 = temp;
    }

    public int peek() {
        return stack1.peek();
    }

    public int dequeue() {
        return stack1.pop();
    }

    public boolean isEmpty() {
        return stack1.size() == 0;
    }

    public static void main(String[] args) {
        System.out.println("Queues with Two Stacks");
        QueuesWithStack queue = new QueuesWithStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front: " + queue.peek()); // 10
        System.out.println("Dequeue: " + queue.dequeue()); // 10
        System.out.println("Front after dequeue: " + queue.peek()); // 20
        System.out.println("Is empty? " + queue.isEmpty());
    }

}
