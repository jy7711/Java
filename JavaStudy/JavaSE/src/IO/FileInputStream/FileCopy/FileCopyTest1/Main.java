package IO.FileInputStream.FileCopy.FileCopyTest1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
            文件拷贝
            就这么水灵灵的拷下来了？
     */
    static void main() throws IOException {

        //记录时间
        long start = System.currentTimeMillis();


        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");
        FileOutputStream fos = new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt");
        //拷贝
        //核心思想 ： 边读边写
        int b;
        while ((b = fis.read()) != -1) {
            fos.write(b);
        }
        //释放资源 ：
        //规则 ： 先开后关
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end-start);
        
    }
}
