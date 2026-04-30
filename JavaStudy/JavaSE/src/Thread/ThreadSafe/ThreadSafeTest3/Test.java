package Thread.ThreadSafe.ThreadSafeTest3;

import Thread.ThreadMethod.ThreadMethodTest1.MyThread;

public class Test {
    /*
        需求 ： 某电影院100张票， 3个售票口
        利用同步方法完成
        技巧 ： 同步代码块
     */
    static void main() {
        MyRunnable mr = new MyRunnable();

        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);
        Thread t3 = new Thread(mr);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
