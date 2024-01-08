package Add_Zero_Group.stack_arrayList;

import java.util.ArrayList;

public class stackAarrayList {
    static class stack{
        static ArrayList<Integer> s = new ArrayList<>();

        public static boolean isEmpty(){
            return s.size() == 0;
        }

        public static void push(int data){
            s.add(data);
        }
        public static int pop(){
            if (isEmpty()){
                return -1;
            }
            int t = s.get(s.size()-1);
            s.remove(s.size()-1);
            return t;
        }
        public static int peek(){
            if (isEmpty()){
                return -1;
            }
            return s.get(s.size()-1);
        }
    }
    public static void main(String[] args) {
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
