package IO.ByteStream.ByteStreamTest3;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    static void main() throws IOException {
        FileReader fr = new FileReader("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");

        char[] chars = new char[2];
        int len;
        //read(chars) 读取数据， 解码， 强转三步合并了， 把强转之后的字符放到数组当中
        //空参的read + 强制类型转换
        while ((len = fr.read(chars)) != -1) {
            //System.out.println(new String(chars, 0, len));
            System.out.print(new String(chars, 0, len));
        }
        fr.close();
    }
}
