package Extends.ExtendsTest6;

public class Main {
    static void main() {

        // 1. 子类构造方法的第一行， 有一个默认的super(), 如果我们没有书写， JVM也会自动加上
        // 2. 如果想要访问父类的带参构造， super(参数) 必须手动写上， 不能省略
        // 3. 在创建对象的时候， 先执行父类的构造方法， 再执行子类的构造方法

        Student stu = new Student("张三", 23, "一年级");
        System.out.println(stu.name + ", " + stu.age + ", " + stu.grade);

    }
}
