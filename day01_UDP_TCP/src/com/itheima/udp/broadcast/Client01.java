package com.itheima.udp.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * UDP 广播发送端
 */
public class Client01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        byte[] bytes = "通知:\n\t明天全校师生放假一天".getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 9008;
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);
        ds.send(dp);
        ds.close();
    }
}
