package IO.FileInputStream.FileInputStreamTest1;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    /*
            读取文件中的数据， 暂时不写中文

            步骤 ： 创建对象， 读取数据， 释放资源
     */
    static void main() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");

        for (int i = 0; i < 5; i++) {
            System.out.println((char)fis.read());
        }
        //读完了输出-1
        System.out.println(fis.read());
        System.out.println((char)fis.read());
        //释放资源
        fis.close();
    }
}
