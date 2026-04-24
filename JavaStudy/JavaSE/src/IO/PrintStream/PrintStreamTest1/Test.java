package IO.PrintStream.PrintStreamTest1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Test {
    /*
            字节打印流 ：
                构造方法
                    public PrintStream(OutputStream/File/String)                                关联字节输出流/文件/文件路径
                    public PrintStream(String fileName, Charset charset)                        指定字节编码
                    public PrintStream(OutputStream out, boolean autoFlush)                     自动刷新
                    public PrintStream(OutputStream out, boolean autoFlush, String encoding)    指定字节编码且自动刷新
                成员方法
                    public void write(int b)                                常规方法 ： 规则和之前一样， 将指定的字节输出
                    public void println(XXX xx)                             特有方法 ： 打印任意数据， 自动刷新， 自动换行
                    public void print(XXX xx)                               特有方法 ： 打印任意数据， 不换行
                    public void printf(String format, Object... args)       特有方法 ： 带有占位符的打印语句， 不换行
    */
    static void main() throws FileNotFoundException {
        PrintStream ps = new PrintStream(new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        ps.println("jy");
        ps.print(123);
        ps.println();
        ps.printf("%s爱%s","jy", "yx");
        ps.close();
    }
}
