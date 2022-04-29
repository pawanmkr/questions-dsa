public class Stack {

    int a[];
    int capacity;
    int top;

    public void myStack(int capacity) {
        this.capacity = capacity;
        top = -1;
        a = new int[capacity];
    }

    void push(int data) {
        if(top == capacity - 1) {
            System.out.println("Stack is completely filled");
        }
        top++;
        a[top] = data;
    }

    int pop() {
        if(top == -1) {
            System.out.println("Push something first in it");
        }
        int show = a[top];
        top--;
        return show;
    }

    int peek() {
        if (top == -1) {
            System.out.println("khali hai");
        }
        return a[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.myStack(5);

        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);
        stack.push(55);

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());

    }

}
