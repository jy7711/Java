package Ccollection.auto;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    static void main() {
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        a.add("ddd");

        //普通遍历
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            //获取元素并移动指针
            String str = it.next();
            System.out.println(str);
        }
        //一个指针只能用一次
        //迭代器遍历不能使用集合的增删


        //增强for遍历
        for (String str : a) {
            //修改迭代器里的值不会改变结果
            str = "qqq";
            System.out.println(str);
        }
        System.out.println(a);


        //lambda表达式
        a.forEach(s -> System.out.println(s));
        //两行是一样的
        a.forEach(System.out::println);

        for (int i = 0; i < a.size(); i++) {
            if (i == 0) a.add(0, "qqq");
            if (i == a.size()-1) a.remove("aaa");
        }
        System.out.println(a);

    }
}
