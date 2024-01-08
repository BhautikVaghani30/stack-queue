package Add_Zero_Group.stack_questions;

import java.util.Stack;

public class ReversString {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        String str = "hello bhautik";
        for (int i = 0; i < str.length(); i++) {
            s.push(str.charAt(i));
        }
        while (!s.isEmpty()){
            System.out.print(s.pop());
        }
        System.out.println();
    }
}
