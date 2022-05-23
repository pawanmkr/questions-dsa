import java.util.Arrays;
import java.util.HashSet;

//number of distinct elements in an array using hashsets
public class Distinct {

    public int distinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int element: arr) {
            set.add(element);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[] list = {1, 3 ,3 ,9 ,2 , 9, 3, 9, 17};

        Distinct distinct = new Distinct();
        System.out.println(distinct.distinct(list));
    }
}
