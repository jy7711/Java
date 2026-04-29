package Thread.ThreadMethod.ThreadMethodTest3;

public class Test {
    /*
        final void setDaemon(boolean on)    设置为守护线程

        细节 ：
            当其他非守护线程执行完毕之后， 守护线程会陆续结束
     */
    static void main() {
        MyThread1 t1 = new MyThread1();
        MyThread1 t2 = new MyThread1();

        t1.setName("女神");
        t2.setName("备胎");

        t2.setDaemon(true);

        t1.start();
        t2.start();
    }
}
