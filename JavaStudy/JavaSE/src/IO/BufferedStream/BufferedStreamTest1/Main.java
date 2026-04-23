package IO.BufferedStream.BufferedStreamTest1;

import java.io.*;

public class Main {
    /*
            需求 ：
                利用字节缓冲流拷贝文件

            字节缓冲输入流的构造方法 ：
                public BufferedInputStream(InputStream is)

            字节缓冲输出流的构造方法
                public BufferedOutputStream(OutputStream os)
     */
    static void main() throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();
    }
}
