package Ccollection.Generics.GenericsTest2;

import java.util.ArrayList;

public class Listutil {

    private Listutil() {}

    //类中定义一个静态方法addAll， 用来添加多个集合的元素

    //可变参数
    public static<E> void addAll(ArrayList<E> a, E ... e) {
        for (E element : e)  a.add(element);
    }
}
