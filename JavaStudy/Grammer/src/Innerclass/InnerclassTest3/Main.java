package Innerclass.InnerclassTest3;

public class Main {

    static void main() {
        Outer.Inner oi = new Outer(). new Inner();
        oi.show();
    }

}
/*
1. 内部类的分类 ？
    成员内部类， 静态内部类， 局部内部类， 匿名内部类

2. 什么是成员内部类 ？
    写在成员位置的， 属于外部类的成员

3. 获取成员内部类对象的两种方式 ？
    方式一 ： 当成员内部类被private修饰时
            在外部编写方法， 对外提供内部类对象
    方式二 ： 当成员内部类被非私有修饰时， 直接创建对象
            Outer.Inner oi = new Outer(). new Inner();

4. 外部类成员变量和内部类成员变量重名时， 在内部类如何访问？
   sout("Outer.this.变量名");
 */
