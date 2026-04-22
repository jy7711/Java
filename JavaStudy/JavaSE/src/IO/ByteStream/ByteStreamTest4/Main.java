package IO.ByteStream.ByteStreamTest4;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    /*
            public void flush()     将缓冲区中的数据， 刷新到本地文件中
            public void close()     释放资源/关流
     */
    static void main() throws IOException {
        FileWriter fw = new FileWriter("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt", true);

        fw.write("一三一四");
        fw.write(22222);
        char[] chars = {'j', 'y', '7'};
        fw.write(chars);
        fw.close();
    }
}
