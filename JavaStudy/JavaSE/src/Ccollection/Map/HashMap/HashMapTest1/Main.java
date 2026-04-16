package Ccollection.Map.HashMap.HashMapTest1;

import java.util.*;

public class Main {

    /*
    通过键找值的方式遍历map集合， 用迭代器， 增强for， lambda表达式三种写法
     */
    static void main() {
        Map<String, String> mp = new HashMap<>();

        mp.put("jy", "JY");
        mp.put("ly", "LY");
        mp.put("ln", "LN");

        System.out.println(mp);
        System.out.println("-------------------------");

        Set<String> keys = mp.keySet();
        for (String key : keys) {
            System.out.println(key + "+" + mp.get(key));
        }
        System.out.println("-------------------------");


        mp.forEach((key, value)-> System.out.println(key + "+" + value));
        keys.forEach(key -> System.out.println(key + "+" + mp.get(key)));
        System.out.println("-------------------------");

        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s + "+" + mp.get(s));
        }
    }
}
