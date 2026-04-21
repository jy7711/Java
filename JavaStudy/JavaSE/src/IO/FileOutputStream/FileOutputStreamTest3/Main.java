package IO.FileOutputStream.FileOutputStreamTest3;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    /*
            换行符 ：
                    再次写出一个换行符就可以了
                    windows :       \r\n
                    Linux :         \n
                    Mac :           \r
            细节 ：
                    在windows操作系统中， java对回车换行进行了优化
                    虽然完整的是\r\n, 但是问你写其中一个\r 或\n，
                    java也可以实现换行， 因为java底层会补全

            续写 ：
                    如果想要续写， 打开续写开关即可
                    开关位置， 创建对象的第二个参数
                    默认false : 表示关闭续写， 此时创建对象后会清空文件
                    手动传递true， 表示打开续写， 此时创建对象不会清空文件
     */

    static void main() throws IOException {

        FileOutputStream fos =
                new FileOutputStream
                        ("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt", true);//打开续写开关

        String str = "jy";

        fos.write(str.getBytes());

        String zz = "\r\n";

        fos.write(zz.getBytes());

        fos.write(str.getBytes());

        fos.write(zz.getBytes());

        fos.close();
    }
}
