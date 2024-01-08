package Add_Zero_Group.stack_questions;

import java.util.Stack;

public class PushAtBottom {

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        pushAtBottom(s,40);
        System.out.println(s.peek());
        System.out.println(s);
    }

    private static void pushAtBottom(Stack<Integer> s, int i) {
        if (s.isEmpty()){
            s.push(i);
            return;
        }
        int top = s.pop();
        pushAtBottom(s,i);
        s.push(top);
    }
}
