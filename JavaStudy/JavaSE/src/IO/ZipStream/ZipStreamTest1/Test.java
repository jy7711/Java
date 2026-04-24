package IO.ZipStream.ZipStreamTest1;

import Interface.InterfaceTest2.Person;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {
    /*
        zip是一个条目目录， 不是嵌套储存
        folder/          （这是一个目录条目，以 / 结尾）
        folder/1.txt     （文件条目）
        folder/sub/      （目录条目）
        folder/sub/2.txt （文件条目）
     */
    static void main() throws IOException {
        // 1. 创建一个File表示要解压的压缩包
        File src = new File("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.zip");
        // 2. 创建一个File表示解压的目的地
        File dest = new File("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\");

        unzip(src, dest);
    }

    //定义一个方法来解压
    public static void unzip(File src, File dest) throws IOException {
        //解压的本质 ： 把压缩包里面的每一个文件或者文件夹读取出来， 按照层级拷贝到目的地当中

        //创建一个解压缩流用来读取压缩包中的数据
        ZipInputStream zip = new ZipInputStream(new FileInputStream(src));
        //要先获取到压缩包里面的每一个zippentry对象

        //表示当前在压缩包中获取到的文件或者文件夹
        ZipEntry entry;
        while ((entry = zip.getNextEntry()) != null) {
            if (entry.isDirectory()) {
                //文件夹 ：需要在目的地dest处创建一个同样的文件夹
                File file = new File(dest, entry.toString());
                file.mkdirs();
            }
            else {
                //文件 ： 需要读取到压缩包中的文件， 并把他存放到目的地dest文件夹中（按照层级目录进行存放）
                FileOutputStream fos = new FileOutputStream(new File(dest, entry.toString()));
                int b;
                while ((b = zip.read()) != -1) {
                    fos.write(b);
                }
                fos.close();
                zip.closeEntry();
            }
        }

        zip.close();
    }
}
