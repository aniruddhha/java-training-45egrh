package afternoon;

import java.util.*;

public class ChildCollections {

    public static void arrayListDemo() {

        ArrayList<String> arrLst = new ArrayList<>();

        arrLst.add("abc");
        arrLst.add("pqr");
        arrLst.add("lmn");
        arrLst.add("xyz");
        arrLst.add("111");

        System.out.println(arrLst.toString());

        for(int i = 0; i< arrLst.size(); i++) {

            System.out.println(" i = " + arrLst.get(i) );
        }

        for (String el : arrLst) {
            System.out.println(el);
        }

        Iterator<String> it = arrLst.iterator();

        while(it.hasNext()) {
            String el = it.next();
            System.out.println("Element " + el);
        }
    }

    public static void linkedListDemo() {
        LinkedList<String> ll = new LinkedList<>();

        ll.add("abc");
        ll.add("pqr");
        ll.add("lmn");
        ll.add("xyz");

        System.out.println(ll.toString());
    }

    public static void threadDemo() {

        Vector<String> vec = new Vector<>();

        Thread t1 = new Thread(() -> {
            vec.add("abc");
        });
        t1.start();

        Thread t2 = new Thread(() -> {
          vec.add(("pqr"));
        });
        t2.start();
    }

    public static void stackDemo() {
        Stack<String> stk = new Stack<>();

        stk.add("abc");
        stk.add("pqr");
        stk.add("lmn");

        System.out.println(stk.toString());

        stk.push("xyz");
        stk.pop();
    }
}
