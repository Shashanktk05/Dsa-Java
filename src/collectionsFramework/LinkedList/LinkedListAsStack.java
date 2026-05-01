package collectionsFramework.LinkedList;

import java.util.LinkedList;

public class LinkedListAsStack {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<Integer>();
        li.push(5523);
        li.push(555523);
        li.push(8523);
        li.push(1523);
        System.out.println(li);
        System.out.println(li.pop());
        System.out.println(li.pop());
        System.out.println(li.pop());
        System.out.println(li.pop());
//        System.out.println(li.pop());  NoSuchElementException

    }
}
