package Reflect.ReflectTest2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class Test {
    /*
        Class类中用于获取构造方法的方法
            Constructor<?>[] getConstructors()
            Constructor<?>[] getDeclaredConstructors()
            Constructor<T> getConstructor(Class<?>... parameterTypes)
            Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)

        Constructor类中用于创建对象的方法
            T newInstance(Object... initargs)
            setAccessible(boolean flag)
     */
    static void main() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. 获取class字节码文件的对象
        Class clazz = Class.forName("Reflect.ReflectTest2.Student");
        
        //2. 获取构造方法
        /*Constructor[] cons = clazz.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/

        /*Constructor[] cons = clazz.getDeclaredConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }*/

//        Constructor con1 = clazz.getConstructor();
//        System.out.println(con1);
//
//        Constructor con2 = clazz.getDeclaredConstructor(String.class);
//        System.out.println(con2);
//
//        Constructor con3 = clazz.getDeclaredConstructor(int.class);
//        System.out.println(con3);
//
        Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
        System.out.println(con4);

//        int modifiers = con4.getModifiers();
//        System.out.println(modifiers);
//
//        Parameter[] parameters = con4.getParameters();
//        for (Parameter parameter : parameters) {
//            System.out.println(parameter);
//        }

        //暴力反射 ：表示临时取消权限校验
        con4.setAccessible(true);
        Student stu = (Student) con4.newInstance("张三", 23);

        System.out.println(stu);
    }
}
























