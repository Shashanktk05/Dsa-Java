package collectionsFramework.Vector;
import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(2221);
        v.add(2266);
        v.add(252);
        v.add(422);
        v.add(2);
        v.add(32);
        v.add(52);
        System.out.println(v);
        for(Object ele : v){
            System.out.println(ele);
        }
    }
}
