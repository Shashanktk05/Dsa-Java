package collectionsFramework.arraylist;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    @Override
    public String toString() {
        return "id=" + id + ", name= " + name ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==this){
            return true;
        }
        if(!(obj instanceof Student)){
            return false;
        }
        return ((Student) obj).id==id && ((Student) obj).name.equals(name);
    }
}
class idComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        return Integer.valueOf(s1.id).compareTo(s2.id);
    }
}
class nameComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        return s1.name.compareTo(s2.name);
    }
}

public class CustomObjectSort {
    public static void main(String[] args) {
        Student s1 = new Student(55,"Jhon");
        Student s2 = new Student(88,"Ghon");

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);

        Collections.sort(al,new nameComparator());


        System.out.println(al);
        Collections.sort(al,new idComparator());
        System.out.println(al);


    }
}
