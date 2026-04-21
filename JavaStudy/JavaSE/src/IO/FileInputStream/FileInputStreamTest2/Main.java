package IO.FileInputStream.FileInputStreamTest2;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    /*
            字节输入流循环读取
     */
    static void main() throws IOException {
        FileInputStream fis = new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\a.txt");

        //read实际上是指针， 和hasNext一样， 循环读取的时候要提前记录

//        while (fis.read() != -1) {
//            System.out.print((char)fis.read());//bdf￿
//        }
        int b;
        while ((b = fis.read()) != -1) {
            System.out.print((char)b);//abcdefg
        }
        fis.close();
    }
}
