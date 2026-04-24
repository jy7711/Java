package IO.ConvertStream.ConvertStreamTest3;

import java.io.*;
import java.nio.charset.Charset;

public class Main {
    /*
            将GBK文件转成UTF-8
     */
    static void main() throws IOException {
        //了解
//        InputStreamReader isr = new InputStreamReader(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"), "GBK");
//        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\c.txt"), "UTF-8") ;
//
//        int ch;
//        while ((ch = isr.read()) != -1) {
//            osw.write(ch);
//        }
//
//        osw.close();
//        isr.close();

        //掌握
        FileReader fr = new FileReader("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\d.txt", Charset.forName("UTF-8"));

        int ch;
        while ((ch = fr.read()) != -1) {
            fw.write(ch);
        }

        fw.close();
        fr.close();
    }
}
