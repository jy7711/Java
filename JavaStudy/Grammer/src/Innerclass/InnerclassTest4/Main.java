package Innerclass.InnerclassTest4;

public class Main {

    static void main() {

        Outer.Inner oi = new Outer.Inner();
        oi.show1();

        Outer.Inner.show2();

        Outer o = new Outer();
        System.out.println(o.a);
        System.out.println(Outer.b);
        //静态的可以不用创建对象直接调用， 非静态的需要创建对象再调用
    }
}
/*
1. 什么是静态内部类 ？
    静态内部类是一种特殊的成员内部类

2. 直接创建静态内部类对象的方式 ？
    Outer.Inner oi = new Outer.Inner();

3. 如何调用静态内部类中的方法 ？
    非静态方法 ： 先创建对象， 用对象调用
    静态方法 ： 外部类名.内部类名.方法名();
 */