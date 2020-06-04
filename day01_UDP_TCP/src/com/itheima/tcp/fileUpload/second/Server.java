package com.itheima.tcp.fileUpload.second;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP 服务器
 */
public class Server {
    public static void main(String[] args) throws Exception {
        // 1.创建服务器Socket
        ServerSocket server = new ServerSocket(9119);
        System.out.println("等待连接...");
        // 2.获取连接的客户端Socket
        Socket accept = server.accept();
        System.out.println("客户端连接成功!");
        // 3.获取Socket的输入流,并用本地输出流永久保存文件
        InputStream is = accept.getInputStream();
        FileOutputStream fos = new FileOutputStream("day01_UDP_TCP\\Files\\Server\\2_load2.png");
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = is.read(bs))!= -1){
            fos.write(bs,0,len);
        }

        // 4.获取Socket输出流,向客户端反馈信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传成功啦");
        bw.newLine();
        bw.flush();

        // 5.关闭资源
        bw.close();
        accept.close();
        server.close();
    }
}
