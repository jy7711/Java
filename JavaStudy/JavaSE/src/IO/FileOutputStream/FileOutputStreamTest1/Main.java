package IO.FileOutputStream.FileOutputStreamTest1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    /*
            1. 创建对象
            2. 写出数据
            3. 释放资源
     */
    static void main() throws IOException {
        FileOutputStream fos = new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");
        //F:\Java\JavaStudy\JavaSE\src\IO\FileOutputStream\FileOutputStreamTest1\a.txt
        fos.write(97);

        fos.close();

    }
}
