package ObjectClass;


import java.util.ArrayList;
import java.util.Objects;

class Student extends Object {
    int sid;
    String name;

    public Student(String name, int sid) {
        this.name = name;
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sid=" + sid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       Student s = (Student) o;
       return Objects.equals(this.name,s.name) && this.sid==s.sid;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid, name);
    }
}


public class ObjectClassMethods {


    public static void main(String[] args) {

        Student s1= new Student("Martin",121);
        Student s2= new Student("Martin",121);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
