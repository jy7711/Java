package Sstream.StreamTest9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    //Stream流终结方法
    /*
            void forEach(Consumer action)       遍历
            long count                          统计
            toArray()                           收集流中的数据， 放到数组中
     */
    static void main() {

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "张无忌", "周芷若", "赵敏", "张强", "张三丰", "张翠山", "张良", "王二麻子", "谢广坤");

        list.stream().forEach(s -> System.out.println(s));

        //long count()
        //返回的是此时流里面的长度
        System.out.println(list.stream().count()); // 9

        //toArray() 收集流中的数据， 放到流中
        System.out.println(Arrays.toString(list.stream().toArray()));

        System.out.println(Arrays.toString(list.stream().toArray(value -> new String[value])));


    }
}
