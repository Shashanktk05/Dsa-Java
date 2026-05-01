package collectionsFramework.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArraylistExample {
    public static void main(String[] args) {
        ArrayList al =new ArrayList();
        al.add("Hello");
        al.add(null);
        al.add(true);
        al.add("A");
        al.add("30");
        al.add(20);
        al.add(10);
        ArrayList al2 = new ArrayList(15);
        al2.add(10000);
        al2.add(10);


        al.add(2,al2);

        System.out.println("al :"+al);
//        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al.get(i));
//        }
//        System.out.println(al.get(2));


//        Iterator cursor = al.iterator();
//        while(cursor.hasNext()){
//            System.out.println(cursor.next());
//        }

//        ListIterator cursor = al.listIterator(2);
//        while (cursor.hasNext()){
//            System.out.println(cursor.next());
//        }

//        ListIterator cursor = al.listIterator(al.size());
//                while(cursor.hasPrevious()){
//                    System.out.println(cursor.previous());
//                }
        System.out.println(al.remove(0));
        System.out.println(al.remove(Integer.valueOf(10)));
        al.trimToSize();
        System.out.println(al.isEmpty());


    }
}
