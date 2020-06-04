package com.itheima.tcp.fileUpload.first;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端,接收数据
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建ServerSocket,指定端口
        ServerSocket ss = new ServerSocket(9112);
        System.out.println("等待客户端连接...");

        // 2.等待客户端连接
        Socket socket = ss.accept();
        System.out.println("客户端已连接!");

        // 3.创建Socket输入流,本地输出流保存在本地
        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("day01_UDP_TCP\\Files\\Server\\2_load.jpg");
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = is.read(bs)) != -1){
            fos.write(bs,0,len);
        }

        // 4.向服务器反馈信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        String message = "上传成功";
        bw.write(message);
        bw.newLine();
        bw.flush();

        // 5.关闭资源
        fos.close();
        socket.close();
        ss.close();
    }
}
