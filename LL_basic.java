public class LL_basic {

    static Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> null");
    }

    public static int search(int target) {
        int index = 0;
        Node temp = head;
        while(temp.data != target) {
            temp = temp.next;
            index++;
        }

        return index;
    }

    public static void main(String[] args) {
        LL_basic list = new LL_basic();
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(7);
        list.addFirst(5);
        list.addFirst(1);
        list.print();

        System.out.println(search(1));
    }

}
