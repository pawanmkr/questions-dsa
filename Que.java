public class Que {

    // --------------- using arrays ----------------
    int rear = 0, size = 5;
    int [] line = new int[size];

    public void enque(int data) {
        if (rear == size) {
            System.out.println("no space left!");
        }
        else {
            line[rear] = data;
            rear++;
            System.out.println(data + " <----- is now in the queue.");
        }
    }

    public void deque() {
        System.out.println(line[0] + " ----> left the queue");
        for (int i = 0; i < rear-1; i++) {
            line[i] = line[i+1];
        }
        rear -= 1;
    }

    public void showall() {
        System.out.println("\n");
        for (int i = 0; i < rear; i++) {
            System.out.println(line[i]);
        }
    }




    // --------------------- queue using linked-list -----------
//    class Node {
//        int data;
//        Node next;
//        public Node(int data) {
//            this.data = data;
//        }
//    }
//
//    Node front, rear;
//    public void enque(int data) {
//        Node newNode = new Node(data);
//        if(front == null) {
//            front = rear = newNode;
//        }
//        rear.next = newNode;
//        rear = newNode;
//    }
//
//    public void deque() throws Exception {
//        if (front == null) {
//            throw new Exception();
//        }
//        int result = front.data;
//        front = front.next;
//        System.out.println("Removed ---> " + result);
//    }
//
//    public void all() {
//        Node temp = front;
//        int index = 0;
//        while (temp != rear) {
//            System.out.println(index + ". " + temp.data);
//            temp = temp.next;
//            index++;
//        }
//    }

    public static void main(String[] args) throws Exception {
        Que que = new Que();
        que.enque(12);
        que.enque(100);
        que.enque(34);
        que.enque(2);
        que.enque(23);

        que.deque();
        que.deque();

        que.showall();
    }

}




























