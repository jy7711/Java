package IO.ObjectStream.ObjectStreamTest1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Test2 {
    /*
            需求 ：
                    利用反序列化流/对象操作输入流， 把文件中的对象读到程序当中
            构造方法 ：
                    public ObjectInputStream(InputStream out)       把基本流变成高级流
            成员方法 ：
                    public Object readObject()                      把序列化到本地文件中的对象， 读到程序中来
     */
    static void main() throws IOException, ClassNotFoundException {

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\Java\\JavaStudy\\JavaSE\\src\\IO\\b.txt"));

        //Object o = ois.readObject();
        Student s = (Student) ois.readObject();
        //System.out.println(o);
        System.out.println(s);

        ois.close();
    }
}
