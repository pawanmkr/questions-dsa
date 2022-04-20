public class LinkedList {

    Node head;

    //this node class is a blueprint of every node that will be created
    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    //to add node at first position in linked-list
    public void addFirst(String data) {
        //creating a new node
        Node newNode = new Node(data);

        //if no linked list exist
        if(head == null) {
            head = newNode;
            return;
        }

        //if already a linked list exist
        newNode.next = head;
        head = newNode;
    }

    //to add node in the last position
    public void addLast(String data) {
        //creating a new node
        Node newNode = new Node(data);

        //if no linked list exist
        if(head == null) {
            head = newNode;
            return;
        }

        //assigned head to temporary node for traversing through the list
        Node tempNode = head;

        //finding a node which has null in next(last node where tempNode will be added)
        while(tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = newNode;
    }

    //printing linked-list
    public void printList() {
        Node tempNode = head;
        while(tempNode != null) {
            System.out.print(tempNode.data + " -> ");
            tempNode = tempNode.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst("is");
        list.addFirst("name");
        list.printList();

        list.addFirst("My");
        list.printList();

        list.addLast("Pawan Kumar");
        list.printList();
    }
}
