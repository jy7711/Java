package IO.PrintStream.PrintStreamTest3;

import java.io.PrintStream;
import java.io.PrintWriter;

public class Test {
    /*
        打印流的应用场景
     */
    //获取打印流的对象， 此打印流在虚拟机启动的时候， 由虚拟机创建， 默认指向控制台
    //特殊的打印流 ： 系统中的标准输出流， 是不能关闭， 在系统中是唯一的
    static void main() {
        PrintStream ps = System.out;

        ps.println("江月何年初照人");

        ps.close();

        ps.println("不知江月待何人");
    }
}
