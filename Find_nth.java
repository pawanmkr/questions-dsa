public class Find_nth {
// finding nth node from backward direction of linked-list

    Node head;
    private int size = 0;

    class Node {
        String data;
        Node next;

        Node(String word) {
            this.data = word;
            this.next = null;
            size++;
        }

    }

    //adding elements
    public void add(String word) {
        Node newNode = new Node(word);

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

    public void getSize() {
        System.out.println(size);
    }

    public void find_nth(int target) {
        String data = "";
        Node temp = head;

        int actual_target = (size - target) + 1;
        if(actual_target > size || actual_target < 0) {
            System.out.println("Target is less than zero! choose from 1 - " + size);
            return;
        }
//        else if (actual_target < 0) {
//            System.out.println("Index out of bounds! Program terminated.");
//            return;
//        }

        for(int i = 0; i < actual_target; i++) {
            data = temp.data;
            temp = temp.next;
        }

        System.out.println(data);
    }

    public static void main(String[] args) {
        Find_nth list = new Find_nth();
        list.add("My");
        list.add("name");
        list.add("is");
        list.add("Pawan");
        list.add("Kumar");

        list.getSize();

        list.find_nth(0);
    }

}
