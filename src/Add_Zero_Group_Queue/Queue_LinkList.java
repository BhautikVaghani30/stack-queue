package Add_Zero_Group_Queue;

public class Queue_LinkList {
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Cll{
        public static Node head = null;
        public static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }
        public static void add(int data)
        {
            Node newNode = new Node(data);
            if (head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            int top = head.data;
            if (tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return top;
        }
        public static int peek(){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String[] args) {
        Cll cl = new Cll();
        cl.add(10);
        cl.add(20);
        cl.add(30);
        while(!cl.isEmpty()){
            System.out.print(cl.peek() + " -> ");
            cl.remove();
        }

    }
}
