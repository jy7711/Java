package Ccollection.Sset.HashSet.HashSetTest1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class SetTest1 {

    static void main() {

        Set<String> s = new HashSet<>();

        s.add("aaa");
        //当前元素第二次添加， 会添加失败
        s.add("aaa");
        s.add("bbb");
        s.add("ccc");


        System.out.println(s);
        System.out.println();

        //迭代器遍历
        Iterator<String> it = s.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println();

        //增强for
        for (String str : s) System.out.println(str);
        System.out.println();

        //匿名内部类
        s.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();

        //lambda表达式
        s.forEach(str -> System.out.println(str));
        s.forEach(System.out::println);
    }
}
/*

1.  Set系列集合的特点
    · 无序， 不重复， 无索引
    · Set集合的方法上基本与Collection的API一致

2. Set集合的实现类特点
    · HashSet : 无序， 不重复， 无索引
    · LinkedHashSet : 有序， 不重复， 无索引
    · TreeSet : 可排序， 不重复， 无索引

 */
