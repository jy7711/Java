package IO.FileInputStream.FileCopy.FileCopyTest2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
            public int read(byte[] buffer)          一次读一个字节数组数据
     */

    static void main() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");
        byte[] bytes = new byte[2];
        //一次读取多个字节数据， 具体读多少跟数组的长度有关
        //返回值 ： 本次读取到了多少个字节数据
        int len1 = fis.read(bytes);
        System.out.println(len1);
        String str1 = new String(bytes, 0, len1);
        System.out.println(str1);

        int len2 = fis.read(bytes);
        System.out.println(len2);
        String str2 = new String(bytes, 0, len2);
        System.out.println(str2);

        int len3 = fis.read(bytes);
        System.out.println(len3);
        //如果这里只传一个bytes的话， 最后读出去的是ed, 没读到的部分会保留上次的数据
        String str3 = new String(bytes, 0, len3);
        System.out.println(str3);
    }
}
