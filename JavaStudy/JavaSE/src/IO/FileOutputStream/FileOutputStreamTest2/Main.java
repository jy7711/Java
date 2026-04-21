package IO.FileOutputStream.FileOutputStreamTest2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
            void write(int b)                           一次写一个字节数据
            void write(byte[] b)                        一次写一个字节数组数据
            void write(byte[] b, int off, int len)      一次写一个字节数组的部分数据
     */
    static void main() throws IOException {

        FileOutputStream fos = new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");

        byte[] bytes = {97, 98, 99, 100, 101};

        fos.write(97);


        fos.write(bytes);

        //该数组， 从off索引开始， 长度为2
        fos.write(bytes, 1, 2); // bc

        fos.close();
    }
}
