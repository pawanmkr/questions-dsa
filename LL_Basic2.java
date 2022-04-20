import java.util.Scanner;

public class LL_Basic2 {

    Node head;

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

    public void remove(int target) {
        Node temp = head;

        while(temp.data != target) {
            temp = temp.next;
        }
        temp.next = null;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL_Basic2 list = new LL_Basic2();

        int i = 0;
        while(i<50) {
            list.last(sc.nextInt());
            i++;
        }

        list.print();
        list.remove(25);
        list.print();
    }
}
