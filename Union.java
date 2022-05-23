import java.util.HashSet;

//union of two arrays using hashset
public class Union {
    public int union(int[] one, int[] two) {
        HashSet<Integer> set = new HashSet<>();
        for(int element: one) {
            set.add(element);
        }
        for(int element: two) {
            set.add(element);
        }
        return set.size();
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 5};
        int[] second = {5, 2};

        Union union = new Union();
        System.out.println(union.union(first, second));
    }
}
