package IO.ObjectStream.ObjectStreamTest2;

import java.io.*;
import java.util.ArrayList;

public class Test2 {
    /*
        将多个对象序列化到文件当中， 但是对象的个数不确定， 用数组存
     */
    static void main() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        ArrayList<Student> arr = (ArrayList<Student>) ois.readObject();

        System.out.println(arr);

        ois.close();
    }
}
