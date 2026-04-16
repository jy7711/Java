package Sstream.StreamTest8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Main {
    /*
            map         转换流中的数据类型

            注意1 ： 中间方法， 返回新的stream流， 原来的stream流只使用一次， 建议使用链式编程
            注意2 ： 修改stream流中的数据， 不会影响原来集合或者数组中的数据
     */
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");

        //需求 ： 只获取里面的年龄并打印
        //String -> int

        list.stream().map(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                String[] arr = s.split("-");
                String ageString = arr[1];
                int age = Integer.parseInt(ageString);
                return age;
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("---------------------------------");

        list.stream()
                .map(s -> Integer.parseInt(s.split("-")[1]))
                .forEach(s -> System.out.println(s));
    }
}
