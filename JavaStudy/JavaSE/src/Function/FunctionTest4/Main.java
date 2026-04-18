package Function.FunctionTest4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    /*
            方法引用 ： 引用构造方法
            格式 ：
                    类名::new

            目的 ：
                    创建这个类的对象

            需求 ：
                    集合里面储存姓名和年龄， 封装成Student对象并存储到List当中

            // 1. 引用处需要是函数式接口
            // 2. 被引用的方法需要已经存在
            // 3. 被引用方法的形参和需要返回值需要跟抽象方法的形参和返回值保持一致
            // 4. 被引用方法的功能需要满足当前的要求
     */
    static void main() {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");

        List<Student> newlist = list.stream().map(new Function<String, Student>() {
            @Override
            public Student apply(String s) {
                return new Student(s.split("-")[0], Integer.parseInt(s.split("-")[1]));
            }
        }).toList();
        System.out.println(newlist);
        System.out.println("-----------------------------");

        List <Student> newlist1 = list.stream().map(Student::new).toList();
        System.out.println(newlist1);
    }
}
