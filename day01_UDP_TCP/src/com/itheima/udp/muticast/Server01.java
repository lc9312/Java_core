package com.itheima.udp.muticast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

/**
 * 组播接收端
 */
public class Server01 {
    public static void main(String[] args) throws Exception {
        // 1.新建组播Socket,指定端口
        MulticastSocket ms = new MulticastSocket(9110);
        // 2.加入指定的组播地址
        InetAddress address = InetAddress.getByName("224.0.2.9");
        ms.joinGroup(address);
        // 3.新建包,用于接收数据
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        // 4.接收站接收数据放入备好的包中
        ms.receive(dp);
        // 5.解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));
        // 6.释放资源
        ms.close();
    }
}
