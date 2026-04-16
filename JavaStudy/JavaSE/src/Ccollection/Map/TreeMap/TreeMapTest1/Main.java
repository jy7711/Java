package Ccollection.Map.TreeMap.TreeMapTest1;

import java.util.Comparator;
import java.util.TreeMap;

public class Main {

    static void main() {
        TreeMap<Integer, String> tm = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1 : 当前要添加的元素
                //o2 : 表示已经在红黑树中存在的元素
                //return o1 - o2;
                return o2 - o1;
            }
        });

        tm.put(4, "a");
        tm.put(1, "d");
        tm.put(3, "f");
        tm.put(2, "b");
        tm.put(5, "n");

        System.out.println(tm);
    }
}
