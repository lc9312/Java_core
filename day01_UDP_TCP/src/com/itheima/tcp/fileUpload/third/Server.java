package com.itheima.tcp.fileUpload.third;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 接收端
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建服务器Socket,指定端口
        ServerSocket ss = new ServerSocket(9007);
        System.out.println("等待连接...");
        // 2.获取Socket,连接客户端
        Socket accept = ss.accept();
        System.out.println("连接成功!");
        // 3.获取Socket输入流,用本地输出流将文件永久保存
        InputStream is = accept.getInputStream();
        FileOutputStream fos = new FileOutputStream("day01_UDP_TCP\\Files\\Server\\4_load3.png");
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = is.read(bs)) != -1){
            fos.write(bs,0,len);
        }
        // 4.获取Socket输出流,向服务器反馈信息,使用字符转换流防止乱码
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("传送成功!");
        bw.newLine();
        bw.flush();
        // 5.关闭资源,本地流和Socket以及服务端Socket
        fos.close();
        accept.close();
        ss.close();
    }
}
