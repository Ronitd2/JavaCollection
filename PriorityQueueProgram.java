import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueProgram {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(27);
        pq.offer(15);
        pq.offer(17);
        pq.offer(20);
        
        System.out.println(pq);   // Heap-based internal structure
        pq.poll();                // Removes smallest (head)
        System.out.println(pq);
        System.out.println(pq.peek());  // Peeks the smallest (head)
    }
}
