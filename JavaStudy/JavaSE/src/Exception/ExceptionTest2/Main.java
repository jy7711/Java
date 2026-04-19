package Exception.ExceptionTest2;

public class Main {
    /*
            JVM默认处理异常的方式
            1. 把异常的名称， 异常原因及异常出现的位置等信息输出在了控制台
            2. 程序停止运行， 异常下面的代码不会再执行了
     */
    static void main() {
        System.out.println("1111111111");
        System.out.println("2222222222");
        System.out.println(2/0); //算数异常 ArithmeticException
        System.out.println("3333333333");
    }
}
