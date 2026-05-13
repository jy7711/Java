package Reflect.ReflectTest1;

public class Test {
    /*
        获取class对象的三种方式 ：
            1. Class.forName("全类名");
            2. 类名.class
            3. 对象.getClass();
     */
    static void main() throws ClassNotFoundException {
        // 1. 全类名 ： 包名 + 类名
        Class clazz1 = Class.forName("Reflect.ReflectTest1.Student");

        // 2.
        Class clazz2 = Student.class;

        // 3. 当我们已经有这个类的对象时才可以调用
        Student s = new Student();
        Class clazz3 = s.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
