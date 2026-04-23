package IO.BufferedStream.BufferedStreamTest4;

import java.io.*;

public class Main {
    /*
        字符缓冲输出流 ：
            构造方法 ：
                    public BufferedWriter(Writer r)
            特有方法 ：
                    public void newLine()    跨平台的换行
     */
    static void main() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        bw.write(1 + "");
        bw.newLine();
        //bw.write("一片冰心在玉壶");
        bw.newLine();

        bw.close();
    }
}
