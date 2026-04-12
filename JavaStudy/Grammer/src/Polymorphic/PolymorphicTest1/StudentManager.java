package Polymorphic.PolymorphicTest1;

public class StudentManager {

    //定义一个方法表示注册用户
    public static void register(Person person) {
        System.out.println("姓名为" + person.getName() + "的账户注册成功， 账号" + person.getUsername() + ", 密码" + person.getPassword());

        //传递不同的对象， 调用不同类里面的work方法
        person.work();
    }
}
