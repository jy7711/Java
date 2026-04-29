package Thread.ThreadMethod.ThreadMethodTest5;

public class Test {
    /*
        public final void join()        插入线程
        同样不常用
     */
    static void main() throws InterruptedException {

        MyThread t = new MyThread();
        t.setName("jy");
        t.start();

        //表示把t这个线程， 插入到当前线程之前
        //t : jy
        //当前 ： main
        t.join();


        //main
        for (int i = 0; i < 10; i++) {
            System.out.println("main@" + i);
        }
    }
}
