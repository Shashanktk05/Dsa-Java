package collectionsFramework.ArrayDequeue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeueExample {
    public static void main(String[] args) {
        ArrayDeque aq = new ArrayDeque();
        aq.add(2);
        aq.add(2);
//        aq.add(null); //NullPointerException
        aq.add(12.3);
        aq.add(true);
        aq.add("Hello");

//        for (Object ele :aq){
//            System.out.println(ele);
//        }

        Iterator cursor = aq.descendingIterator();
        while(cursor.hasNext()){
            System.out.println(cursor.next());
        }

    }
}
