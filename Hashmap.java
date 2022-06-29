class Hashmap {
    String[] arr = new String[1000];
    static int size = 1000;
    public static int hash(String key) {
        int hash = key.hashCode();
        return hash % size;
    }
    public void put(String key, String value) {
        int index = hash(key);
        arr[index] = value;
    }
    public String get(String key) {
        int index = hash(key);
        return arr[index];
    }
    public static void main(String[] args) {
        Hashmap map = new Hashmap();
        map.put("babu", "lal");
        System.out.println(map.get("babu"));
    }
}