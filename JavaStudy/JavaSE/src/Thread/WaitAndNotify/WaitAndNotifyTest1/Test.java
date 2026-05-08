package Thread.WaitAndNotify.WaitAndNotifyTest1;

public class Test {
    /*
        需求 ： 完成生产者和消费者 （等待唤醒机制） 的代码
        实现线程轮流交替执行的结果
     */
    static void main() {
        Cook c = new Cook();
        Foodie f = new Foodie();

        //设置线程名字
        c.setName("厨师");
        f.setName("吃货");

        //开启线程
        c.start();
        f.start();
    }
}
