package Ccollection.Map.HashMap.HashMapTest2;

import java.util.*;

public class Main {

    /*
    通过键值对的方式遍历map集合， 用迭代器， 增强for， lambda表达式三种写法
     */
    static void main() {
        Map<String, String> mp = new HashMap<>();

        mp.put("jy", "JY");
        mp.put("ly", "LY");
        mp.put("ln", "LN");

        System.out.println(mp);
        System.out.println("-------------------------");

        Set<Map.Entry<String,String>> entries = mp.entrySet();

        for (Map.Entry<String,String> entry : entries) {
            System.out.println(entry.getKey() + "+" + entry.getValue());
        }
        System.out.println("-------------------------");


    }
}