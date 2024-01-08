package Add_Zero_Group.stack_questions;

import java.util.Arrays;
import java.util.Stack;

public class NextGreterElement {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int[] arr = {
                6,8,0,1,3
        };
        int[] nextGreter = new int[arr.length];
        for (int i = arr.length-1; i >= 0 ; i--) {

//            stap 1
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

//            stap 2
            if (s.isEmpty()){
                nextGreter[i] = -1;
            }else{
                nextGreter[i] = arr[s.peek()];
            }

//            step 3
            s.push(i);
        }
        System.out.println(Arrays.toString(nextGreter));
    }
}
