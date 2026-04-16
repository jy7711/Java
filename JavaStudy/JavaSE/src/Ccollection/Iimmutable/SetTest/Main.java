package Ccollection.Iimmutable.SetTest;

import java.util.Set;

public class Main {
    /*
        创建不可变的set集合

        细节 ： 当我们要获取一个不可变的Set集合时， 里面的参数一定要保证唯一性
     */
    static void main() {

        Set<String> s = Set.of("张三", "李四", "王五", "赵六");

        for (String str : s) System.out.println(str);
        System.out.println("-----------------------");
    }
}
