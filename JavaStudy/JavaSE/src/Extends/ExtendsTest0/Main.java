package Extends.ExtendsTest0;

public class Main {
    static void main() {
        Student s = new Student();
        s.name = "Jy";
        s.age = 19;
        s.grade = "one";

        System.out.println(s.name + ", " + s.age + ", " + s.grade);

        s.eat();
        s.study();

        System.out.println("\n-------------------\n");
        Teacher t = new Teacher();
        t.name = "W";
        t.age = 19;
        t.subject = "药学";

        System.out.println(t.name + ", " + t.age + ", " + t.subject);

        t.eat();
        t.teach();
    }
}
/*
什么是继承？
继承是面向对象三大特征之一， 可以让类跟类产生父子关系

继承的作用是什么？
操作 ： 多个子类中重复的代码抽取到父类， 子类可以直接使用
好处 ： 减少代码冗余， 提高代码复用性

继承的格式？
    public class 子类 extends 父类 {}

继承后子类的好处？
1.子类可以得到父类的属性和行为， 子类可以调用
2.子类可以在父类的基础上新增其他功能， 子类更加强大
 */
