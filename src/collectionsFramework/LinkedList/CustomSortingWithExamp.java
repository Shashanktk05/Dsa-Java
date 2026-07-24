package collectionsFramework.LinkedList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class Empolyee{
    int id;
    String name;

    public Empolyee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id +" "+name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Empolyee empolyee = (Empolyee) o;
        return id == empolyee.id && Objects.equals(name, empolyee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}


public class CustomSortingWithExamp {

    public static void main(String[] args) {
        HashSet <Empolyee>hs = new HashSet<>();
        hs.add(new Empolyee(5,"Smith"));
        hs.add(new Empolyee(5,"Smith"));
        hs.add(new Empolyee(3,"Smith"));
        hs.add(new Empolyee(2,"Smith"));

        System.out.println(hs);
    }
}
