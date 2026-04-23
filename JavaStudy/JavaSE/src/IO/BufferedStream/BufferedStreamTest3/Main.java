package IO.BufferedStream.BufferedStreamTest3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    /*
        字符缓冲输入流 ：
            构造方法 ：
                    public BufferedReader(Reader r)
            特有方法 ：
                    public String readLine()    读一整行
     */
    static void main() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt"));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
