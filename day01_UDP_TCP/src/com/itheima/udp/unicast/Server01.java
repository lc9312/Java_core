package com.itheima.udp.unicast;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.net.DatagramPacket;
/**
 * UDP 单播接收端
 */
public class Server01 {
    public static void main(String[] args) throws Exception {
        // 1.创建接收站,确认本程序端口号
        DatagramSocket ds = new DatagramSocket(9110);
        // 2.新建包,用于接收数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 3.接收站接收数据并将数据放进包里
        ds.receive(dp);
        // 4.解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));
        // 5.释放资源
        ds.close();
    }
}
