package collectionsFramework.LinkedList;

import java.util.LinkedList;

public class LinkedListAsDequeue {
    public static void main(String[] args) {
        LinkedList li = new LinkedList<>();
        li.offer(121);
        li.offer(521);
        li.offer(66121);
        li.offer(5121);
        System.out.println(li);

        li.offerFirst(1111);
        li.offerFirst(11);
        li.offerLast(9);
        li.offerLast(99);

        System.out.println(li);

        System.out.println(li.pollFirst());
        System.out.println(li.pollFirst());
        System.out.println(li.pollLast());
        System.out.println(li.pollLast());

        System.out.println(li);

    }
}
