package Ccollection.Sset.TreeSet.TreeSetTest1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {

    static void main() {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(4);
        ts.add(3);
        ts.add(1);
        ts.add(5);
        ts.add(2);

        System.out.println(ts);
        System.out.println();

        //1.
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        //2.
        for (int x : ts) System.out.println(x);
        System.out.println();

        //3.
        ts.forEach(x -> System.out.println(x));
        System.out.println();
    }
}
