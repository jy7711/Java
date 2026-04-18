package Function.FunctionTest3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

public class Main {
    /*
            方法引用 ： 引用成员方法
            格式
                    其他类 ：   其他类::方法名
                    本类 ：    this::方法名(引用处不能是静态方法)
                    父类 ：    super::方法名(引用处不能是静态方法)
     */
    static void main() {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"张无忌", "周芷若", "赵敏", "张强", "张三丰");

        //只要张开头三个字
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);
        System.out.println("-------------------------");

        list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() == 3 && s.startsWith("张");
            }
        }).forEach(System.out::println);
        System.out.println("-----------------------");

        //静态方法中是没有this的
        list.stream().filter(StringOperation::test).forEach(System.out::println);
    }
}
