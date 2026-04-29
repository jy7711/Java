package Thread.ThreadMethod.ThreadMethodTest4;

import Thread.ThreadMethod.ThreadMethodTest3.MyThread1;

public class Test {
    /*
            public static void yield()      礼让线程

            只是相对礼让， 在执行完后重新选择线程， 应用范围较少
     */
    static void main() {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("飞机");
        t2.setName("坦克");

        t1.start();
        t2.start();
    }
}
