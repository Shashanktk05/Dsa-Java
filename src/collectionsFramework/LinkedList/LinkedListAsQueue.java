package collectionsFramework.LinkedList;

import java.util.LinkedList;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.offer(1220);
        li.offer(6555);
        li.offer(555);
        li.offer(8855);
        li.offer(2522);

        System.out.println(li);

        System.out.println(li.poll());
        System.out.println(li.poll());
        System.out.println(li.poll());
        System.out.println(li.poll());
        System.out.println(li.poll());

    }
}
