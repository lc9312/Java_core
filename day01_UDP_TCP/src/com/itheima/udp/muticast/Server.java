package com.itheima.udp.muticast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * UDP 组播接收端(服务端)
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.新建组播接收站,指定端口
        MulticastSocket ms = new MulticastSocket(9008);

        // 2.准备箱子装数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);

        // 3.将接收站加入组播
        InetAddress address = InetAddress.getByName("224.0.1.7");//这里的IP必须和发送端的IP一致,不然接收不到数据
        ms.joinGroup(address);

        // 4.接收数据
        ms.receive(dp);

        // 5.解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));

        // 6.释放资源
        ms.close();
    }
}
