package Add_Zero_Group.stack_questions;

import java.util.Stack;

public class FindDuplicateParentheses {
    public static void main(String[] args) {
        String s = "(((a+b)c))";
        System.out.println("expresion is valid : " + checkDuplicate(s));
    }

    private static boolean checkDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ')'){
                int c = 0;
                while (s.peek() != '('){
                    s.pop();
                    c++;
                }
                if (c<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;

    }
}
