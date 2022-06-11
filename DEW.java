import java.util.ArrayList;
import java.util.Scanner;

//distinct elements in particular window
public class DEW {
    ArrayList<Integer> list = new ArrayList<Integer>();

    public void findDistinct(int[] temp) {
        for (int i = 0; i < temp.length; i++) {
            if (list.size() > 0) {
                int count = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (temp[i] == list.get(j)) {
                        count++;
                    }
                }
                if (count == 0) {
                    list.add(temp[i]);
                }

            }
            else {
                list.add(temp[i]);
            }
        }
        System.out.print(list);
        System.out.println(" ---> " + list.size());
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 3, 1, 1, 3};
        System.out.print("Specify the windows size: ");
        Scanner sc = new Scanner(System.in);

        int window = sc.nextInt();
        int[] temp = new int[window];
        int gap = arr.length - window;

        for (int i = 0; i < gap; i++) {
            //System.out.println("---- gap: " + gap);
            //System.out.println("---- i: " + i);
            if (gap == arr.length + 1) {
                break;
            }
            int count = 0;
            for (int j = i; j < window + i; j++) {
                temp[count] = arr[j];
                count++;
            }
            gap++;
            DEW dew = new DEW();
            dew.findDistinct(temp);

        }
    }
}
