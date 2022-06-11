import java.util.Scanner;

public class BinarySearch {

    //here arr is sorted array provided, n is the size & k is the target element
    public int binarySearch(int arr[], int n, int k) {
        //low to keep track of lower position in the array
        //high for higher position
        int low = 0, high = n-1;

        //run the loop until low == high
        while (low <= high) {
            //find middle position
            int middle = (low + high)/2;
            if (k == arr[middle]) {
                return middle;
            }
            if (k > arr[middle]) {
                low = middle + 1;
            }
            else if (k < arr[middle]) {
                high = middle - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();

        int sorted[] = {0, 1, 2, 5, 7, 8};
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println(binarySearch.binarySearch(sorted, sorted.length, target));
    }

}
