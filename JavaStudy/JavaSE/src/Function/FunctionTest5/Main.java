package Function.FunctionTest5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class Main {
    /*
            方法引用 ： 类名引用成员方法
            格式 ：
                    类名::成员方法
            需求 ：
                    字符串转大写

            方法引用的规则
            1. 引用处需要是函数式接口
            2. 被引用的方法需要已经存在
            3. 被引用方法的形参和需要返回值需要跟抽象方法的形参和返回值保持一致
            4. 被引用方法的功能需要满足当前的要求

            抽象方法形参的详解 ：
            第一个参数 ： 表示被引用方法的调用者， 决定了可以引用那些类中的方法
                        在Stream流中， 第一个参数一般都表示流里面的每一个数据
                        假设流里面的数据是字符串， 那么使用这种方式进行方法引用， 只能引用String这个类中的方法
            第二个参数到最后一个参数， 跟被引用方法的形参保持一致， 如果没有第二个参数， 说明被引用的方法需要是无参的成员方法

            局限性 ：
                    不能引用所有类中的成员方法
                    是跟抽象方法的第一个参数有关， 这个参数是什么类型的， 那么只引用这个类中的方法
     */
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "aaa", "bbb", "ccc", "ddd");

        list.stream().map(new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        }).forEach(System.out::println);

        System.out.println("-----------------------------");
        list.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
