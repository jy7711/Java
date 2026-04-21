package IO.FileInputStream.FileCopy.FileCopyTest3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
            大文件的拷贝
     */
    static void main() throws IOException {

        //记录时间
        long start = System.currentTimeMillis();

        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt");

        int len;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end-start);
    }
}
