package Ccollection.Sset.HashSet.HashSetTest3;

import java.util.HashSet;
import java.util.Set;

public class Main {

    static void main() {


        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);
        Student s3 = new Student("lisi", 24);
        Student s4 = new Student("wangwu", 26);

        Set<Student> s = new HashSet<>();
        //此时不重写方法里面就有4个元素
        System.out.println(s.add(s1));
        System.out.println(s.add(s2));
        System.out.println(s.add(s3));
        System.out.println(s.add(s4));

        System.out.println(s);
    }
}
