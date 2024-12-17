package afternoon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SimpleCollectionDemos {


    private static void collectionDemo() {
        Collection<String> col = new ArrayList<>();

        col.add("abc");
        col.contains("abc"); //checks abc is there or not
        col.clear(); // deleting all elements
    }

    public static void listDemo() {
        List<Integer> lst = new ArrayList<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(1);

        System.out.println(lst.toString());
    }
    public static void main(String[] args) {

    }
}
