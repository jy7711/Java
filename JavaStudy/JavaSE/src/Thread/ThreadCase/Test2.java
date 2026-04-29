package Thread.ThreadCase;

public class Test2 {
    /*
        多线程的第二种启动方式 ：
            1. 自己定义一个实现类Runnable接口
            2. 重写里面的run方法
            3. 创建自己的类的对象
            4. 创建一个Thread类的对象， 并开启线程
     */
    static void main() {
        // 创建MyRun对象
        // 表示多线程要执行的任务
        MyRun2 mh = new MyRun2();

        // 创建线程对象
        Thread t1 = new Thread(mh);
        Thread t2 = new Thread(mh);

        //给线程设置名字
        t1.setName("线程1");
        t2.setName("线程2");

        t1.start();
        t2.start();

    }
}
