package IO.BufferedStream.BufferedStreamTest5;

import java.io.*;

public class Main {
    /*
        拷贝的四种写法
     */
    static void main() throws IOException {
//        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");
//        FileOutputStream fos = new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt");

//        1.
//        int b;
//        while ((b = fis.read()) != -1) {
//            fos.write(b);
//        }

//        2.
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = fis.read(bytes)) != -1) {
//            fos.write(bytes, 0, len);
//        }

//        fos.close();
//        fis.close();

//        BufferedInputStream br = new BufferedInputStream(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt"));
//        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

//        3.
//        int b;
//        while ((b = br.read()) != -1) {
//            bw.write(b);
//        }

//        4.
//        byte[] bytes = new byte[1024];
//        int len;
//        while ((len = br.read(bytes)) != -1) {
//            bw.write(bytes, 0, len);
//        }
//        bw.close();
//        br.close();
    }
}
