package Ccollection.Map.HashMap.HashMapTest3;

import java.util.*;
import java.util.function.BiConsumer;

public class Main {

    /*
    通过lambda表达式的方式遍历map集合， 用迭代器， 增强for， lambda表达式三种写法
     */
    static void main() {
        Map<String, String> mp = new HashMap<>();

        mp.put("jy", "JY");
        mp.put("ly", "LY");
        mp.put("ln", "LN");

        System.out.println(mp);
        System.out.println("-------------------------");

        mp.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + "+" + value);
            }
        });
        System.out.println("-------------------------");


        mp.forEach((key, value)-> System.out.println(key + "+" + value));
    }
}
