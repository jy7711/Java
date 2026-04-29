package Thread.ThreadCase;

public class Test1 {
    /*
        多线程的第一种启动方式 ：
            1. 自己定义一个类继承Thread
            2. 重写run方法
            3. 创建一个子类的对象， 并启动线程
     */
    static void main() {

        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
