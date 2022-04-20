import java.util.LinkedList;

//LLJCF: linked-list using java collection framework
public class LLJCF {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");
        System.out.println(list);

        list.addLast("Pawan Kumar");
        System.out.println(list);
        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        System.out.println(list.get(1));
    }

}
