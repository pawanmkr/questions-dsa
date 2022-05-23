public class Merge_list {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public void add(int val) {
        int count = 0;
        count++;
        Node node = new Node(val);

        if (head == null) {
            head = node;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        System.out.println("added successfully " + count);
    }

//    public void print() {
//        Node temp = head;
//        System.out.println("entered");
//
//        if(temp == null) {
//            System.out.println("list is empty");
//        }
//        else {
//            while(temp.next != null) {
//                System.out.println(temp.val + " --> ");
//                temp = temp.next;
//            }
//            System.out.println("null");
//        }
//    }

    public void print() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.val + " -> null");
    }

    public static void main(String[] args) {
        Merge_list list = new Merge_list();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.print();
    }
}