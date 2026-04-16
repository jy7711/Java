package Ccollection.Generics.GenericsTest2;

import java.util.ArrayList;

public class Main {

    static void main() {

        ArrayList<String> a1 = new ArrayList<>();
        Listutil.addAll(a1, "aaa", "bbb", "ccc");
        System.out.println(a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        Listutil.addAll(a2, 1, 2, 3, 4);
        System.out.println(a2);
    }
}
