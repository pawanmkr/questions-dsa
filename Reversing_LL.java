public class Reversing_LL {

    Node head;
    private int size;

    Reversing_LL() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void last(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> null");
    }

    public int size() {
        return size;
    }

    public void reverse() {
//        if(head == null || head.next == null) {
//            return;
//        }

        Node current = head;
        Node prev = null;

        while(current != null) {
            Node temp = current.next;

            current.next = prev;
            prev = current;
            current = temp;
        }
        head.next = null;
        head = prev;
    }




    //main function
    public static void main(String[] args) {
        Reversing_LL list = new Reversing_LL();
        list.last(11);
        list.last(22);
        list.last(33);
        list.last(44);
        list.last(55);

        list.print();
        System.out.println(list.size());

        list.reverse();
        list.print();
    }

}
