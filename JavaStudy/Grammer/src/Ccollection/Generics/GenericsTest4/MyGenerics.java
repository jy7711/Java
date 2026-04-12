package Ccollection.Generics.GenericsTest4;

import java.util.ArrayList;

public class MyGenerics {

    static void main() {

        /*
                泛型不具备继承性， 但是数据具备继承性
         */
        ArrayList<Ye> a1 = new ArrayList<>();
        ArrayList<Fu> a2 = new ArrayList<>();
        ArrayList<Zi> a3 = new ArrayList<>();


        method1(a1);
        //method1(a2);
        method2(a2);
        method4(a3);
    }

    //正常调用， 泛型只传递该类型的数据
    public static void method1(ArrayList<Ye> a) {}

    //泛型写在修饰类后面
    public static<E> void method2(ArrayList<E> a) {}

    //不确定类型， 但只想传递Ye Fu Zi
    //此时我们可以用泛型的通配符 ：
    //  ? 也表示不确定的类型， 可以进行类型的限定
    //  ? extend E : 表示可以传递E或者E所有的子类类型
    //  ? super E : 表示可以传递E或者E所有的父类类型
    public static void method3(ArrayList<? extends Ye> a) {}
    public static void method4(ArrayList<? super Zi> a) {}

    /*
        应用场景 ：
                1. 如果我们在定义类， 方法， 接口的时候， 如果类型不确定， 就可以定义泛类型， 泛型方法， 泛型接口
                2. 如果类型不确定， 但是知道以后只能传递某个继承体系中的， 就可以泛型的通配符

        泛型的通配符 ：
                关键点 ： 可以限定类型的范围

     */

}
class Ye{}
class Fu extends Ye{}
class Zi extends Fu{}
