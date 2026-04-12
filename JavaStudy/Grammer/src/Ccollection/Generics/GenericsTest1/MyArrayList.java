package Ccollection.Generics.GenericsTest1;

import java.util.Arrays;

//泛型类
public class MyArrayList<E> {

    Object[] obj = new Object[10];
    int size;

    /*
        E  表示不确定的类型， 该类型后面已经定义过了
        e  形参的名字， 变量名
     */
    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E)obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
