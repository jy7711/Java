package Extends.ExtendTest7;

public class Main {
    static void main() {

        /*
        this() : 调用本类的其他构造方法
        细节 ：
            1. 如果子类中有多个构造方法的时候， 不能用this()互相调用， 一定要预留一个调用父类的构造方法
            2. 如果构造方法当中写上了this(), 就不能再写super(), JVM也不会自动添加super()
            3. 在老版本当中this只能写在构造方法的前一行， 但是在新版本中去掉了这一限制
         */

        Student stu = new Student();
        System.out.println(stu.name + ", " + stu.age );
    }
}
