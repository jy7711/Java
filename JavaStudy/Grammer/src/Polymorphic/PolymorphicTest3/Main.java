package Polymorphic.PolymorphicTest3;

public class Main {

    static void main() {

        Person p = new Person("小惠惠", 20, "女");

        System.out.println(p.getName() + p.getAge() + p.getGender());

        Bicycle b = new Bicycle("飞鸽", 5);
        p.drive(b);

        Car c = new Car("宾利", 80);
        p.drive(c);
    }

}

/*
1. 什么是多态 ？
        事物的多种形态

2. 多态的好处 ？
        好处一 ： 方法中使用父类型作为参数， 可接收父类对象 + 所有子类对象
        好处二 ： 如果进行方法重写， 利用多态调用方法， 可以调用不同子类中重写的方法

3. 多态的弊端是什么 ？
        不能使用子类的特有功能

4. 引用数据类型的类型转换， 有几种方式
        自动类型转换， 强制类型转换

5. 强制类型转换能解决什么问题 ？ 强制类型转换需要注意些什么 ？
        · 可以转换成真正的子类类型， 从而调用子类独有功能
        · 转换类型与真实对象类型不一致会报错
        · 转换时用instanceof关键字进行判断
 */
