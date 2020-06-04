package com.itheima.udp.unicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP 单播发送端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.新建发送端
        DatagramSocket ds = new DatagramSocket();

        // 2.数据打包,写好地址丶端口
        byte[] bs = "欢迎来到德莱联盟!".getBytes();
        InetAddress localHost = InetAddress.getLocalHost();
        int port = 8118;
        DatagramPacket dp = new DatagramPacket(bs,bs.length,localHost,port);

        // 3.发送打包好的数据
        ds.send(dp);

        // 4.关闭资源
        ds.close();
    }
}
