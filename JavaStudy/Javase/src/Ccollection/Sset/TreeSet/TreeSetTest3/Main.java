package Ccollection.Sset.TreeSet.TreeSetTest3;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    static void main() {

        //字符串按长度排序， 长度相同按字典序排序
        TreeSet<String> ts1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                //按字典序排
                if (o1.length() == o2.length()) return o1.compareTo(o2);
                //按长度排
                return o1.length() - o2.length();
            }
        });

        //lambda表达式                             //有两个对象要打括号
        TreeSet<String> ts2 = new TreeSet<>((o1, o2) -> {
            //按字典序排
            if (o1.length() == o2.length()) return o1.compareTo(o2);
            //按长度排
            return o1.length() - o2.length();
        });

        ts2.add("c");
        ts2.add("ab");
        ts2.add("df");
        ts2.add("qwer");

        System.out.println(ts2);
    }
}
