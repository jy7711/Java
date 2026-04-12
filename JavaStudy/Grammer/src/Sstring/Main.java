package Sstring;

import java.util.Scanner;

public class Main {

    static void main() {
        String s1 = "abc";
        String s2 = new String("abc");
        //这里返回的是false (他们的地址值不一样)
        System.out.println(s1 == s2);

        //键盘录入用next
        //Scanner sc = new Scanner(System.in);
        //String a = sc.next();

        //字符串比较
        //boolean equals(要比较的字符串)
        //boolean equalsIgnoreCase(要比较的字符串， 忽略大小写)
        boolean b1 = s1.equals(s2);
        System.out.println(b1); //true

        //字符串长度是s1.length(), 数组长度是a.length
        System.out.println(s1.length());

        //字符串不能直接访问下标， 要用charAt传值
        char c = s1.charAt(1);
        System.out.println(c); //b

        //s1.length().fori;从头到尾遍历的简写
        String s = "abcdefg";

        //截取从 [1, 5)索引的字符串， 包括1不包括5
        // 只能截取， 不能删改， 删改用新字符串赋值
        System.out.println(s.substring(1,5));
        //把s中的所有a换成b， 同样是只替换不删改
        System.out.println(s.replace("a", "b"));

        //是否包含 contains
        System.out.println(s.contains("abd"));
        //判断开头， 结尾      startWith/endsWith
        //查找               indexOf(int ch)   lastIndexOf(int ch)
        //判断是否为空         s.isEmpty()
        //转字符数组          char[] array = s.toCharArray()
        //大小写转换           toUpperCase(), toLowerCase()
        //去除头尾空格          trim()

    }
}
