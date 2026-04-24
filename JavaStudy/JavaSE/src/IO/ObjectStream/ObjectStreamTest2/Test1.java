package IO.ObjectStream.ObjectStreamTest2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Test1 {
    /*
        将多个对象序列化到文件当中， 但是对象的个数不确定， 用数组存
        ***Student必须实现Serializable接口
     */
    static void main() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        ArrayList<Student> arr = new ArrayList<>();

        arr.add(new Student("jy", 17));
        arr.add(new Student("lys", 19));
        arr.add(new Student("ly", 16));

        oos.writeObject(arr);

        oos.close();
    }
}
