package com.itheima.udp.unicast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 *
 * UDP 单播发送端
 */
public class Client01 {
    public static void main(String[] args) throws Exception {
        // 1.创建发送站,随机端口
        DatagramSocket ds = new DatagramSocket();
        // 2.数据打包,指定接收站IP和端口
        byte[] bs = "草原上最美的花,火红的萨日朗.".getBytes();
        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 9110;
        DatagramPacket dp = new DatagramPacket(bs,bs.length,address,port);
        // 3.发送打包后的数据
        ds.send(dp);
        // 4.释放资源
        ds.close();
    }
}
