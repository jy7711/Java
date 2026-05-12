package Socketnet.TCP.TCPTest1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.BufferOverflowException;

public class Server {
    //TCP协议， 接收数据
    static void main() throws IOException {
        //1. 创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10000);

        //2. 监听客户端的链接
        Socket socket = ss.accept();

        //3. 从连接通道中获取输入流读取数据
        //InputStream is = socket.getInputStream();
        //中文乱码用字符流
        //InputStreamReader isr = new InputStreamReader(is);
        //BufferedReader br = new BufferedReader(isr);
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        int b;
        while ((b = br.read()) != -1) {
            System.out.print((char) b);
        }

        //4. 释放资源
        socket.close();
        ss.close();
    }
}
