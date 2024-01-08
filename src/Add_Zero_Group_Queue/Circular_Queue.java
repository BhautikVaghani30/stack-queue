package Add_Zero_Group_Queue;

public class Circular_Queue {
    static class Cqueue{
        static int arr[];
        static int size;
        static int front;
        static int rear;
        public Cqueue(int s){
            this.size = s;
            this.arr = new int[s];
            this.front = -1;
            this.rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1 && front == -1;
        }
        public static boolean isFull(){
            return (rear+1)%size == front;
        }
        public static void add(int data){
            if (isFull()){
                System.out.println("queue is full");
                return;
            }
            if (front == -1) front = 0;
            rear = (rear+1)%size;
            arr[rear] = data;
        }

        public static int remove(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int top = arr[front];
            if (rear == front){
                front = rear = -1;
            }else{
                front=(front+1)%size;
            }
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return arr[front];
        }
        public static void print() {
            if (!isEmpty()) {
                int i = front;
                do {
                    System.out.print(arr[i] + " ");
                    i = (i + 1) % size;
                } while (i != (rear + 1) % size);
                System.out.println();
            } else {
                System.out.println("Queue is empty.");
            }
        }
    }

    public static void main(String[] args) {
        Cqueue cq = new Cqueue(3);
        cq.add(10);
        cq.add(10);
        cq.add(10);

        cq.print();

        cq.remove();
        cq.add(20);
        cq.print();
        cq.remove();
        cq.add(30);
        cq.print();
        cq.remove();
        cq.add(40);
        cq.print();


        cq.print();
        System.out.println(cq.peek());
    }
}
