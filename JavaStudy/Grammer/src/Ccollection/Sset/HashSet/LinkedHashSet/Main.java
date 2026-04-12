package Ccollection.Sset.HashSet.LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {

    static void main() {
        Student s1 = new Student("zhangsan", 23);
        Student s2 = new Student("zhangsan", 23);
        Student s3 = new Student("lisi", 24);
        Student s4 = new Student("wangwu", 26);

        LinkedHashSet<Student> lhs = new LinkedHashSet<>();
        //此时不重写方法里面就有4个元素
        System.out.println(lhs.add(s1));
        System.out.println(lhs.add(s2));
        System.out.println(lhs.add(s3));
        System.out.println(lhs.add(s4));

        System.out.println(lhs);
    }
}
/*
1. LinkedHashSet集合的特点和原理是怎么样的
        · 有序， 不重复， 无索引
        · 底层是基于哈希表， 使用双链表记录添加顺序

2. 在以后如果想要数据去重， 我们使用哪个
        默认使用HashSet
        如果要求去重且存取有序， 才使用LinkedHashSet
 */
