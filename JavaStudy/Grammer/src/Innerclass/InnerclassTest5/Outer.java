package Innerclass.InnerclassTest5;

import java.lang.classfile.attribute.InnerClassesAttribute;

public class Outer {

    int b = 20;

    public void show() {

        int a = 10;

        class Inner {
            String name = "Jy";
            int age = 19;

            public void method1() {
                System.out.println(a);
                System.out.println(b);
                System.out.println("局部内部类的method1方法");
            }

            public static void method2() {
                System.out.println("局部内部类的method2静态方法");
            }
        }

        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.method1();
        Inner.method2();
    }
}
