package Thread.ThreadSafe.ThreadSafeTest4;

import Thread.ThreadSafe.ThreadSafeTest4.MyThread;

public class Test {
    /*
        需求 ： 某电影院100张票， 3个售票口
        JDK5的lock实现
     */
    static void main() {

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
