package afternoon;

import java.util.*;

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

    public static void setDemo() {
        Set<String> mobiles = new HashSet<>();
        mobiles.add("12345");
        mobiles.add("56789");
        mobiles.add("909797");
        mobiles.add("12345");

        System.out.println(mobiles.toString());
    }

    public static void mapDemo() {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "abc");
        map.put(2, "pqr");
        map.put(3, "lmn");

        System.out.println("Key 1" + map.get(1));;

        Set<Integer> keys = map.keySet();

        Collection<String> values = map.values();
    }
    public static void main(String[] args) {
        setDemo();
    }
}
