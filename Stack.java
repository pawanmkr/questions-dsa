public class Stack {

    stackNode head;
    static int size = 0;

    class stackNode {
        int data;
        stackNode next;
        stackNode(int data) {
            this.data = data;
        }
    }

    //insert operation
    public void push(int data) {
        stackNode temp = new stackNode(data);
        temp.next = head;
        head = temp;
        size++;
        System.out.println(head.data + " pushed into stack.");
    }

    //remove operation
    public void pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
        }
        System.out.println(head.data + " popped out.");
        head = head.next;
        size--;
    }

    //checking the size
    public void capacity() {
        System.out.println(size);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(33);
        stack.push(55);
        stack.push(100);
        stack.capacity();
        stack.pop();
        stack.capacity();
    }

}
