import java.util.LinkedList;
public class Hashmap2<String, Integer> {
    //node creation
    private class Node {
        String key;
        Integer value;
        Node(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
    private int size;
    private LinkedList<Node>[] buckets;
    public Hashmap2() {
        initbuckets(4);
        size = 0;
    }
    public void initbuckets(int N) {
        buckets = new LinkedList[N];
        for (int i = 0; i < N; i++) {
            buckets[i] = new LinkedList<>();
        }
    }
    private int genHash(String key) {
        int hash = key.hashCode();
        return hash % buckets.length;
    }
    private int findIndexWithinBucket(String key, int value) {
        for (Node node: buckets[value]) {
            if (node.key.equals(key)) {
                return value;
            }
        }
        return 0;
    }

    public void put(String key, Integer value) {
        int findIndex = genHash(key);
        int ifAlready = findIndexWithinBucket(key, findIndex);
    }

}
