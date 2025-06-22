import java.util.*;

public class MinHeapExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println(pq);
        System.out.println("Top element: " + pq.peek());  // 10

        while (!pq.isEmpty()) {
            System.out.println("Polled: " + pq.poll());  // 10, then 20, then 30
        }
    }
}
