package Reflect.ReflectTest3;

import java.lang.reflect.Field;

public class Test {
    /*
        Class类中用于获取成员变量的方法
            Field[] getFields()                 返回所有公共成员变量对象的数组
            Field[] getDeclaredFields()         返回所有成员变量对象的数组
            Field getField(String name)         返回单个公共成员变量对象
            Field getDeclaredField(String name) 返回单个成员变量对象

        Field类中用于创建对象的方法
            void set(Object obj, Object value)  赋值
            Object get(Object obj)              获取值
     */
    static void main() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        //1. 获取class字节码文件的对象
        Class clazz = Class.forName("Reflect.ReflectTest3.Student");

        //2. 获取所有的成员变量
//        Field[] fields = clazz.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field);
//        }

        //获取单个的成员变量
        Field gender = clazz.getDeclaredField("gender");
        System.out.println(gender);

        //获取权限修饰符
        int modifiers = gender.getModifiers();
        System.out.println(modifiers);

        //获取成员变量的名字
        String g = gender.getName();
        System.out.println(g);

        //获取成员变量的数据类型
        Class<?> type = gender.getType();
        System.out.println(type);

        //获取成员变量记录的值
        Student s = new Student("张三", 23, "男");
        gender.setAccessible(true);
        Object value = (String) gender.get(s);
        System.out.println(value);

        //修改对象里面记录的值
        gender.set(s, "女");
        System.out.println(s);
    }
}




























