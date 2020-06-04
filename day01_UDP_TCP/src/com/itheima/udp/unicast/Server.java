package com.itheima.udp.unicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 单播服务端(接收端)
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建接收站,指定端口号
        DatagramSocket ds = new DatagramSocket(8118);
        // 2.准备好接收箱子
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 3.接收数据,放入准备好的箱子
        ds.receive(dp);
        // 4.解析数据
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
        // 5.关闭资源
        ds.close();
    }
}
