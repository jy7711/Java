package IO.ConvertStream.ConvertStreamTest4;

import java.io.*;

public class Main {
    /*
        利用字节流读取文件中的数据， 每次读一整行， 而且不能出现乱码

        1. 字节流在读取中文的时候， 是会出现乱码的， 但是字符流可以搞定
        2. 字节流里面是没有读一整行的方法的， 只有字符缓冲流才能搞定
     */
    static void main() throws IOException {

//        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
//        BufferedReader br = new BufferedReader(isr);
//        String str = br.readLine();
//        System.out.println(str);
//        br.close();

        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt")));

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
