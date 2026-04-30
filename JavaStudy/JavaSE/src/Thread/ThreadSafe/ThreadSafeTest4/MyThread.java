package Thread.ThreadSafe.ThreadSafeTest4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread {
    //表示这个类所有的对象， 都共享ticket数据
    static int ticket = 0; // 0 ~ 99

    //锁对象， 一定要是唯一的
    //static Object obj = new Object();

    static Lock lock = new ReentrantLock();

    @Override
    public void run() {

        while (true) {
            //同步代码块
            //synchronized (MyThread.class) {

            lock.lock();

            try {
                if (ticket < 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    ticket++;
                    System.out.println(getName() + "正在卖第" + ticket + "张票");
                } else break;
            } catch (RuntimeException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

            //}

        }

    }

}
