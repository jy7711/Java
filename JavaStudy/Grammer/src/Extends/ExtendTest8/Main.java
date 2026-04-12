package Extends.ExtendTest8;

public class Main {
    static void main() {
        BachelorStudent bs = new BachelorStudent("Jy", 19, "大一");
        System.out.println(bs.getName() + ", " + bs.getAge() + ", " + bs.getGrade());
        bs.eat();
        bs.sleep();
        bs.study();
    }
}

/*
子类真正能继承父类的是什么？
    构造方法 ： 不能被子类继承， 可以利用super关键字调用
    成员变量 ： 可以被子类继承， private私有的也可以， 但是无法直接调用
    成员方法 ： 虚方法可以被继承
              final修饰的最终方法不能被继承， 可以被调用， 编译器确定位置， 运行时直接调用
              static修饰的静态方法不能被继承， 可以被调用， 编译器修改为类名调用， 运行时直接调用
              private修饰的私有方法不能被继承， 不能被调用
              方法重写 ： 子类替换虚方法表里面方法的地址值
 */