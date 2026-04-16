package Sstream.StreamTest6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {

    static void main() {
        /*
        filter          过滤
        limit           获取前几个元素
        skip            跳过前几个元素
         */

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        //过滤
        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                //如果返回值为true， 表示当前数据留下
                //如果返回值为false, 表示当前数据舍弃不要
                return s.startsWith("张");
            }
        }).forEach(s -> System.out.println(s));

        System.out.println("-------------------------------");

        list.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .forEach(s -> System.out.println(s));

        System.out.println("-------------------------------");

        System.out.println(list);
        System.out.println("-------------------------------");

        //limit, skip
        list.stream().limit(3).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        list.stream().skip(4).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        //"张强", "张三丰", "张翠山"
        list.stream().limit(6).skip(3).forEach(s -> System.out.println(s));
        System.out.println("-------------------------------");

        list.stream().skip(3).limit(3).forEach(s -> System.out.println(s));

    }
}
