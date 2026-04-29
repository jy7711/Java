package Thread.ThreadSafe.ThreadSafeTest2;

public class Test {
    /*
        需求 ： 某电影院100张票， 3个售票口
     */
    static void main() {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
