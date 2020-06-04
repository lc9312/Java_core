package com.itheima.udp.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP-广播
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建发送站
        DatagramSocket ds = new DatagramSocket();

        // 2.准备好数据,转换成字节数组,打包装入箱子,并准备好地址和端口
        byte[] bs = "通知:\n\t所有人注意,明天提前半个小时上班!".getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 9118;
        DatagramPacket dp = new DatagramPacket(bs,bs.length,address,port);

        // 3.发送装好数据的箱子
        ds.send(dp);

        // 4.关闭资源
        ds.close();
    }
}
