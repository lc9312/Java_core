package com.itheima.udp.muticast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP 组播发送端(客户端)
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建发送站
        DatagramSocket ds = new DatagramSocket();
        // 2.打包数据,确定组播地址丶端口
        byte[] bs = "组队语音!".getBytes();
        InetAddress address = InetAddress.getByName("224.0.1.7");
        int port = 9008;
        DatagramPacket dp = new DatagramPacket(bs,bs.length,address,port);
        // 3.发送数据
        ds.send(dp);
        // 4.关闭资源
        ds.close();
    }
}
