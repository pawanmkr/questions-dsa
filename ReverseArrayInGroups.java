import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayInGroups {
    //n = size and k = target index
    public void reverse(ArrayList<Integer> arr, int n, int k) {

        k -= 1;
        for (int i = k; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
        }
        for (int i = n-1; i > k; i--) {
            System.out.print(arr.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        int size = arr.size();

        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        ReverseArrayInGroups rag = new ReverseArrayInGroups();
        rag.reverse(arr, size, index);
    }
}
