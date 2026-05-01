package collectionsFramework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {


    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.add(10);
        li.add(10);
        li.add(null);
        li.add(true);
        li.add("String");
        li.add(12.20);

        System.out.println(li);

        LinkedList l2 = new LinkedList();
        l2.add(10);
        l2.add(10);
        l2.add(null);
        l2.add(true);
        l2.add("String");
        l2.add(12.20);


        li.addAll(l2);
        System.out.println(li);

//        for (int i = 0; i < li.size(); i++) {
//            System.out.println(li.get(i));
//        }

//        for (Object ele : li){
//            System.out.println(ele);
//        }

//        Iterator cursor = li.iterator();
//        while (cursor.hasNext()){
//            System.out.println(cursor.next());
//        }

        Iterator cursor = li.descendingIterator();
        while (cursor.hasNext()){
            System.out.println(cursor.next());
        }

    }
}
