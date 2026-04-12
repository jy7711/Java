package Polymorphic.PolymorphicTest1;

public class Main {

    static void main() {
        /*
            学生类 ：
                    属性 ： 姓名， 账号， 密码
                    行为 ： work， 学生的工作是学习
            老师类 ：
                    属性 ： 姓名， 账号， 密码
                    行为 ： work， 老师的工作是教书
            管理员 ：
                    属性 ： 姓名， 账号， 密码
                    行为 ： work， 管理员的工作是管理网站

            学生管理系统 ：
                    行为 ： 注册register
                    要求 ： 能注册所有的角色
                    输出 ： 姓名为张三的同学账号注册成功， 账号zhangsan， 密码123456
         */

        Student stu = new Student("张三", "zhangsan" , "123456");

        StudentManager.register(stu);

        Teacher tea = new Teacher("李四", "lisi", "12345678");

        StudentManager.register(tea);
    }
}

/*
1. 什么是多态 ？
        事物的多种形态

2. 多态的表现形式 ？
        Fu f = new Zi();
3. 多态的前提 ？
        · 有继承/实现关系
        · 有父类引用指向子类对象
        · 有方法的重写
4. 多态的好处 ？
        好处一 ： 方法中使用父类型作为参数， 可接收父类对象 + 所有子类对象
        好处二 ： 如果进行方法重写， 利用多态调用方法， 可以调用不同子类中重写的方法
 */
