public class CircularQue {
    int rear = -1, front = -1;
    int size =5;
    int [] arr = new int[size];
//    CircularQue(int size) {
//        this.size = size;
//    }

    public void enque(int data) {
        if (rear == -1) {
            rear++;
            front++;
            arr[rear] = data;
        }
        else {
            rear = (rear+1) % size;

            if (front == rear) {
                System.out.println("!no space left");
            }
            else {
                arr[rear] = data;
            }
        }
    }

    public void deque() {
        if (front == -1) {
            System.out.println("alreay empty");
        }
        else {
            front++;
        }
    }

    public void showall() {
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        CircularQue circular = new CircularQue();
        circular.enque(2021);
        circular.enque(2022);
        circular.enque(2023);
        circular.enque(2024);
        circular.enque(2025);

        circular.showall();

        circular.deque();
        System.out.println("\n");
        circular.showall();
    }
}
