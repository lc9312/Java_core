package com.itheima.tcp.fileUpload.second;

import java.io.*;
import java.net.Socket;

/**
 * TCP 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建客户端,指定IP和端口
        Socket socket = new Socket("127.0.0.1",9119);
        // 2.获取本地输入流和Socket输出流
        FileInputStream fis = new FileInputStream("day01_UDP_TCP\\Files\\Client\\2.jpg");
        OutputStream os = socket.getOutputStream();
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = fis.read(bs))!= -1){
            os.write(bs,0,len);
        }
        socket.shutdownOutput();// 关闭Socket 的输出流通道
        // 3.获取Socket输入流,接收服务端响应
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = null;
        while ((str = br.readLine())!= null){
            System.out.println(str);
        }
        // 4.关闭资源
        br.close();
        fis.close();
        socket.close();
    }
}
