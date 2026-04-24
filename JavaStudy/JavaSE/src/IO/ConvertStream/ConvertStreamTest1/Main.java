package IO.ConvertStream.ConvertStreamTest1;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Main {
    /*
        利用转换流按照指定字符编码读取
     */
    static void main() throws IOException {
        //了解
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt"), "GBK") ;
//
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            System.out.print(ch);
//        }
//
//        isr.close();


        //掌握
        FileReader fr = new FileReader("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt", Charset.forName("UTF-8"));
        //FileReader fr = new FileReader("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt", Charset.forName("GBK"));

        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }

        fr.close();
    }
}
