package Extends.ExtendsTest6;

public class Student extends Person {

    String grade;

    public Student() {
        System.out.println("子类Student的空参构造执行了");
    }

    public Student(String name, int age, String grade) {
        //父类中的属性， 通过super（参数）的形式传递给父类的构造方法赋值
        super(name, age);
        //子类中的属性， 自己赋值
        this.grade = grade;

        System.out.println("子类Student的带参构造执行了");
    }
}
