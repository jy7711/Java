package Thread.ThreadMethod.ThreadMethodTest2;

import Thread.ThreadMethod.ThreadMethodTest1.MyThread;

public class Test {
    /*
        setPriority(int newPriority)            设置线程的优先级
        final int getPriority()                 获取线程的优先级
     */
    static void main() {
        //创建线程要执行的参数对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t1 = new Thread(mr, "飞机");
        Thread t2 = new Thread(mr, "坦克");

        //优先级从1~10， 默认5
        //只是相对优先， 并不绝对
        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
