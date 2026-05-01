package collectionsFramework.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOfInteger {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(10);
        al.add(420);
        al.add(1033);
        al.add(102);
        al.add(107);

        Collections.sort(al);
        System.out.println(al);

    }
}
