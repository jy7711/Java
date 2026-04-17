package Sstream.StreamTest12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    /*
            创建一个ArrayList集合， 并添加以下字符串， 保留年龄 >= 24, 存到Map中
            "zhangsan,23", "lisi,24", "wangwu,25"
     */
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"zhangsan,23", "lisi,24", "wangwu,25");

        Map<String,Integer> map = list.stream()
                .filter(s -> Integer.parseInt(s.split(",")[1]) >= 24)
                .collect(Collectors.toMap(
                        s -> s.split(",")[0],
                        s -> Integer.parseInt(s.split(",")[1])
                ));

        System.out.println(map);
    }
}
