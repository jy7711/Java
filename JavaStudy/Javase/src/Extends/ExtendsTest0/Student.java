package Extends.ExtendsTest0;

public class Student extends Person {
    //子类继承父类的所有， 在子类中拥有的是子类特有的
    String grade;

    public void study() {
        System.out.println("学生正在学习~");
    }

}