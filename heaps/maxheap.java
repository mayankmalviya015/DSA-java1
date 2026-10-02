import java.util.Collections;
import java.util.PriorityQueue;

public class maxheap {
     public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.add(4);
        System.out.println(pq+" "+pq.peek());
        pq.add(-54);
        System.out.println(pq+" "+pq.peek());
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
    }
}
