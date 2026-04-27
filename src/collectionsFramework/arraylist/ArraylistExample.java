package collectionsFramework.arraylist;

import java.util.ArrayList;

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
        System.out.println("al :"+al);



        ArrayList al2 = new ArrayList(15);
        al2.add(10000);

        System.out.println("al2 :"+al2);

    }
}
