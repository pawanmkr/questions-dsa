public class LL_array_input {

    Node head;
    private int size = 0;

    class Node {
        int data;
        Node next;

        Node(int word) {
            this.data = word;
            this.next = null;
            size++;
        }

    }

    //adding elements
    public void add(int[] array) {

        int length = array.length;
        for(int i = 0; i < length; i++) {
            Node newNode = new Node(array[i]);
            if(head == null) {
                head = newNode;
                continue;
            }

            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

    }

    public void getSize() {
        System.out.println(size);
    }

    //printing linked-list
    public void printList() {

        Node tempNode = head;
        while(tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
        System.out.println("current size: " + size);
    }

    public static void main(String[] args) {
        LL_array_input list = new LL_array_input();
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        list.add(arr);

        list.printList();
    }

}
