package Function.FunctionTest7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
        集合中存储字符串数据， 收集到Student类型的数组
     */
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌-15", "周芷若-14", "赵敏-13", "张强-20", "张三丰-100", "张翠山-40", "张良-35", "王二麻子-37");

        List<Student> newlist = list.stream().map(Student::new).toList();
        System.out.println(list);
    }
}
