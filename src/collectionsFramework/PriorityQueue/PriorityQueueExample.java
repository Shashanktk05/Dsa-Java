package collectionsFramework.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(200);
//        pq.add(4.30);  ClassCastException
        pq.add(1);
        pq.add(-22);
        System.out.println(pq);

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());     //null


    }
}
