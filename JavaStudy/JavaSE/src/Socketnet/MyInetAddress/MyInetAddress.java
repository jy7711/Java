package Socketnet.MyInetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddress {
    /*
        static InetAddress getByName(String host)   确定主机名称的IP地址， 主机名称可以是机器名称， 也可以是IP地址
        String getHostName()                        获取此IP地址的主机名
        String getHostAddress()                     返回文本显示中的IP地址字符串
     */
    static void main() throws UnknownHostException {
        //1. 获取InetAddress的对象
        //IP的对象
        InetAddress address = InetAddress.getByName("江月");//江月/172.19.56.221
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);//江月

        String ip = address.getHostAddress();
        System.out.println(ip);//172.19.56.221
    }
}
