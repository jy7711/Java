package Thread.ThreadPool.ThreadPoolTest1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    /*
        public static ExecutorService newCachedThreadPool()             创建一个没有上限的线程池
        public static ExecutorService newFixedThreadPool(int nThreads)  创建一个有上限的线程池
     */
    static void main() {
        //1. 获取线程池对象
        ExecutorService pool1 = Executors.newFixedThreadPool(3);

        //2. 提交任务
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());
        pool1.submit(new MyRunnable());

        //3. 销毁线程池
        pool1.shutdown();
    }
}
