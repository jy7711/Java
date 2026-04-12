package Ccollection.Generics.GenericsTest3;

import Ccollection.Generics.GenericsTest1.MyArrayList;

public class Main {
    /*
            泛型接口的两种方式 ：
            1. 实现类给出具体的类型
            2. 实现类延续泛型， 创建实现类对象时再确定类型
     */
    static void main() {

        MyArrayList2 a1 = new MyArrayList2();
        //a1.add(123);
        a1.add("aaa");


        MyArrayList3<String> a2 = new MyArrayList3<>();
    }
}
