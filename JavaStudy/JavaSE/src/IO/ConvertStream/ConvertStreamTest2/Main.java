package IO.ConvertStream.ConvertStreamTest2;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    /*
        利用转换流按照指定字符编码读取
     */
    static void main() throws IOException {
        //了解
//        OutputStreamWriter osr = new OutputStreamWriter(new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"), "GBK") ;
//
//        osr.write("jy");
//
//        osr.close();

        //掌握
        FileWriter fw = new FileWriter("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt", Charset.forName("GBK"));

        fw.write("jy");

        fw.close();
    }
}
