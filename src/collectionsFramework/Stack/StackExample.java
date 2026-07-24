package collectionsFramework.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(515);
        s.push(66);
        s.push(778);
        s.push(656);
        s.push(888);

        System.out.println(s);

        s.pop();
        s.pop();
        s.pop();
        s.pop();

        System.out.println(s);

    }
}
