package com.itheima.udp.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 广播接收端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建接收站,指定此接收站端口
        DatagramSocket ds = new DatagramSocket(9118);

        // 2.准备空箱装数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        // 3.接收站将数据接收装箱
        ds.receive(dp);// receive()方法阻塞,直到接收完数据!

        // 4.解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));

        // 5.关闭资源
        ds.close();

    }
}
