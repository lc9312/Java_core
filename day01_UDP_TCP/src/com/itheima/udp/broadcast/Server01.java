package com.itheima.udp.broadcast;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * UDP 广播接收端
 */
public class Server01 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket(9008);
        DatagramPacket dp = new DatagramPacket(new byte[1024],1024);
        ds.receive(dp);
        byte[] data = dp.getData();
        int len = dp.getLength();
        System.out.println(new String(data,0,len));
        ds.close();
    }
}
