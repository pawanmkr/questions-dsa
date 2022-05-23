public class Palindrome_ll {
    private int size = 0;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    Node head;

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

    public void print() {
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> null");
    }





    public boolean isPalindrome() {

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node slow2 = slow.next;
        while(slow2 != null) {
            Node temp = slow2.next;

            slow2.next = slow;
            slow2 = temp;
        }
        slow2 = slow; //here

        System.out.println(slow2.data + " slow2 ");


        Node temp = slow;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data + " -> null");




        while(head != null) {
            if(head.data != slow2.data) {
                System.out.println(false);
                return false;
            }
            head = head.next;
            slow2 = slow2.next;
        }
        System.out.println(true);
        return true;
    }

    public static void main(String[] args) {
        Palindrome_ll list = new Palindrome_ll();

        int[] arr = {1,2,3,2,1};

        list.add(arr);
        list.print();

        list.isPalindrome();

    }

}
