import java.util.LinkedList;
import java.util.Queue;

public class StackWithSingleQueue {

    Queue<Integer> queue = new LinkedList<Integer>();

    public void push(int x) {
        int size = queue.size();
        queue.add(x);
        for (int i = 0; i < size; i++) {
            queue.add(queue.remove());
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return queue.remove();
    }

    public int top(){
         if (queue.isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return queue.peek();
    }

    public boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        StackWithSingleQueue stack = new StackWithSingleQueue();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Top: " + stack.top()); // 3
        System.out.println("Pop: " + stack.pop()); // 3
        System.out.println("Top after pop: " + stack.top()); // 2
        System.out.println("Is empty? " + stack.empty());
    }

}
