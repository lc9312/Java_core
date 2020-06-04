package com.itheima.udp.muticast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * UDP 组播发送端
 */
public class Client01 {
    public static void main(String[] args) throws Exception {
        // 1.创建接收站,随机端口
        DatagramSocket ds = new DatagramSocket();
        // 2.打包数据,指定接收端IP和端口
        byte[] bytes = "动次打次".getBytes();
        InetAddress address = InetAddress.getByName("224.0.2.9");
        int port = 9110;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        // 3.发送数据
        ds.send(dp);
        // 4.释放数据
        ds.close();
    }
}
