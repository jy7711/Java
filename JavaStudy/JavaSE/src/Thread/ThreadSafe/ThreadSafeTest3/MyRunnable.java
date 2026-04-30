package Thread.ThreadSafe.ThreadSafeTest3;

public class MyRunnable implements Runnable {

    int ticket = 1;

    @Override
    public void run() {
        while (true) {
            synchronized (MyRunnable.class) {
                if (method()) break;
            }
        }
    }

    private boolean method() {
        if (ticket == 100) {
            return true;
        }
        else {
            ticket++;
            System.out.println(Thread.currentThread().getName() + "在卖第" + ticket + "张票");
        }
        return false;
    }
}
