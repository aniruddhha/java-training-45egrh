package morning;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDetails {

    public static void hashSetDemo() {
        HashSet<String> hs = new HashSet<>();
        hs.add("abc");
        hs.add("pqr");
        hs.add("lmn");
        hs.add("abc");

        System.out.println(hs.toString());
    }

    public static void linkedHashSetDemo() {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("abc");
        lhs.add("pqr");
        lhs.add("xyz");

        System.out.println(lhs.toString());
    }

    public static void treeSetDemo() {

        TreeSet<String> st = new TreeSet<>();
        st.add("xyz");
        st.add("pwqr");
        st.add("lmn");
        st.add("abc");

        System.out.println(st.toString());
    }

    public static void main(String[] args) {
      treeSetDemo();
    }
}
