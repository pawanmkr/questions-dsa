import java.util.HashSet;

//intersection of two arrays using hashset
public class Intersect {
    public int intersection(int[] one, int[] two) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for(int element: one) {
            set.add(element);
        }
        for(int element: two) {
            if(set.contains(element)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] first = {1, 2, 5, 11, 5, 2};
        int[] second = {5, 2, 1};

        Intersect intersect = new Intersect();
        System.out.println(intersect.intersection(first, second));
    }
}