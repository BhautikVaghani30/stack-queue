package Add_Zero_Group.stack_array;
class stack{
    int[] st;
    int top;
    public stack(int size){
        this.st = new int[size];
        this.top = -1;
    }

    public boolean isEmpty(){
        return top >= st.length;
    }
    public void push(int val){
        if (top >= st.length-1) {
            System.out.println("Stack Overflow");
            return;
        }

        top++;
        st[top] = val;
    }
    public int pop(){
        if (top < 0) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int temp = st[top];
        top--;
        return temp;
    }

    public int getTop(){
        return st[top];
    }
    public void print(){
        if (top < 0) {
            System.out.println("StaStack_implementation Underflow");
            return;
        }
        for (int i = top; i>=0; i--){
            System.out.print(st[i] + " ");
        }
        System.out.println();
    }
}
public class Stack_implimentation {

    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.println("poped value is : " + s.pop());
        System.out.println("poped value is : " + s.pop());
        System.out.println("poped value is : " + s.pop());
        System.out.println("poped value is : " + s.pop());
        System.out.println("poped value is : " + s.pop());
        System.out.println("poped value is : " + s.pop());

//        s.print();

    }
}
