package Sstream.StreamTest13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    /*
    1.男演员三个字前两人
    2.女演员姓杨不要第一个
    3.合并12
    4.把3封装成Actor对象
    5.所有演员对象存到list中
     */
    static void main() {
        ArrayList<String> manlist = new ArrayList<>();
        ArrayList<String> womanlist = new ArrayList<>();
        Collections.addAll(manlist,"cxk,23", "yhx,23", "lbt,22", "wq,24", "gj,30", "xll,27");
        Collections.addAll(womanlist,"zxy,35", "yy,36", "gyy,43", "ztt,31", "ls,35", "yxm,33");

        Stream<String> stream1 = manlist.stream()
            .filter(s -> s.split(",")[0].length() == 3)
            .limit(2);

        Stream<String> stream2 = womanlist.stream()
                .filter(s -> s.split(",")[0].startsWith("y"))
                .skip(1);
        
//        Stream.concat(stream1,stream2).map(new Function<String, Actor>() {
//            @Override
//            public Actor apply(String s) {
//                String name = s.split(",")[0];
//                int age = Integer.parseInt(s.split(",")[1]);
//                return new Actor(name, age);
//            }
//        }).forEach(s -> System.out.println(s));

        List<Actor> newlist = Stream.concat(stream1, stream2)
                .map(s -> new Actor(s.split(",")[0], Integer.parseInt(s.split(",")[1])))
                .collect(Collectors.toList());

        System.out.println(newlist);
    }
}
