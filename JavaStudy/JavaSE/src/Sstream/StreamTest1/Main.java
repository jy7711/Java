package Sstream.StreamTest1;

import java.util.ArrayList;

public class Main {
    /*
        创建集合添加元素
        1. 把所有带“张”的存到新集合中
        2. 把带“张”的， 长度为3的元素再存储到新集合中
     */
    static void main() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("张无忌");
        list1.add("周芷若");
        list1.add("赵敏");
        list1.add("张强");
        list1.add("张三丰");

        ArrayList<String> list2 = new ArrayList<>();
        for (String name : list1) {
            if (name.startsWith("张")) list2.add(name);
        }
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        for (String name : list2) {
            if (name.length() == 3) list3.add(name);
        }
        System.out.println(list3);

        // ===

        list1.stream().filter(name -> name.startsWith("张"))
            .filter(name -> name.length() == 3)
                .forEach(name -> System.out.println(name));
    }
}
