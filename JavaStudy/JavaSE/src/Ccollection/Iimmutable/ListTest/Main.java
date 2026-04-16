package Ccollection.Iimmutable.ListTest;

import java.util.Iterator;
import java.util.List;

public class Main {
    /*
        创建不可变的list集合
     */
    static void main() {
        List<String> list = List.of("张三", "李四", "王五", "赵六");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("---------------------");

        for (String s : list) System.out.println(s);
        System.out.println("---------------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("---------------------");
    }
}
