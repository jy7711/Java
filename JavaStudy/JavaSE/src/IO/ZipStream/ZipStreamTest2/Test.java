package IO.ZipStream.ZipStreamTest2;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {
    /*
            压缩流
                需求 ：
                        把文件打包成一个压缩包
     */
    static void main() throws IOException {
        //1. 创建File对象表示要压缩的文件
        File src = new File("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");
        //2. 创建File对象表示压缩包的位置
        File dest = new File("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\");
        //3. 调用方法用来压缩

        toZip(src, dest);
    }

    /*
        作用 ： 压缩
        参数一 ： 表示要压缩的文件
        参数二 ： 表示压缩包的位置
     */
    public static void toZip(File src, File dest) throws IOException {
        //1. 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        //2. 创建ZipEntry对象， 表示压缩包里面每一个文件和文件夹
        ZipEntry entry = new ZipEntry("a.txt");
        //3. 把ZipEntry对象放到压缩包中
        zos.putNextEntry(entry);
        //4. 把src文件中的数据写到压缩包中
        FileInputStream fis = new FileInputStream(src);
        int b;
        while ((b = fis.read()) != -1) {
            zos.write(b);
        }
        zos.closeEntry();
        zos.close();
    }
}
