package Ccollection.ArrayList;

import java.util.ArrayList;

public class Main {

    static void main() {
        ArrayList<String> a = new ArrayList<>();
        //a.add(); 在尾端添加
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println(a);


        //alt + 鼠标左键 竖着选中

        //插入到该位置， 后面往后顺延
        a.add(2, "qqq");
        System.out.println(a);

        //删除aaa, 至删一个
        a.remove("aaa");
        System.out.println(a);

        //删除原来的二索引
        a.remove(2);
        System.out.println(a);

        //把这个索引的值改为 zzz
        a.set(0, "zzz");
        System.out.println(a);

        //访问该位置
        for (int i = 0; i < a.size(); i++) {
            String ss = a.get(i);
        }

        //返回大小
        System.out.println(a.size());

        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Character> c = new ArrayList<>();
    }
}
/*
1. 什么是集合？
        集合是一种长度可变的容器

2. 集合有什么特点 ？
        特点一 ： 长度可变
        特点二 ： 只能引用数据类型， 不能存基本数据类型

3. 如何创建集合的对象 ？
        ArrayList<String> a = new ArrayList<>();

4. 集合的常见方法 ？
        增删改查

 */
