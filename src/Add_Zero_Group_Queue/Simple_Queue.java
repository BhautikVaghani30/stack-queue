package Add_Zero_Group_Queue;

public class Simple_Queue {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        public Queue(int s){
            this.size = s;
            this.arr = new int[s];
            this.rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }

        public static void add(int data){
            if (rear == size-1){
                System.out.println("queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int top = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[0];
        }
        public static void print(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.add(10);
        q.add(10);
        q.add(10);
//        q.remove();
//        q.remove();
        q.remove();
        q.print();
//        q.remove();
//        q.peek();
    }
}
