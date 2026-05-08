package Thread.ThreadPool.ThreadPoolTest2;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPool {
    /*
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor
        (核心线程数量， 最大线程数量， 空闲线程的最大存活时间， 任务队列， 创建线程工厂， 任务的拒绝策略);

        参数一 ： 核心线程数量                >= 0
        参数二 ： 最大线程数                  > 0， 最大数量 >= 核心线程数量
        参数三 ： 空闲线程的最大存活时间        >= 0
        参数四 ： 时间单位                   用TimeUnit指定
        参数五 ： 任务队列                   不能为null
        参数六 ： 创建线程工厂                不能为null
        参数七 ： 任务的拒绝策略               不能为null
     */
    static void main() {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                3,                          //核心线程数量                >= 0
                6,                                    //最大线程数                  > 0， 最大数量 >= 核心线程数量
                60,                                   //空闲线程的最大存活时间        >= 0
                TimeUnit.SECONDS,                     //时间单位                   用TimeUnit指定
                new ArrayBlockingQueue<>(3),  //任务队列                   不能为null
                Executors.defaultThreadFactory(),     //创建线程工厂                不能为null
                new ThreadPoolExecutor.AbortPolicy()  //任务的拒绝策略               不能为null
        );

        //pool.submit();
    }
}


















