package com.itheima.tcp.fileUpload.third;

import java.io.*;
import java.net.Socket;

/**
 * TCP 客户端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1.创建Socket,指定IP和端口
        Socket socket = new Socket("127.0.0.1",9007);
        // 2.获取本地输入流和Socket输出流,向服务器传数据
        FileInputStream fis = new FileInputStream("day01_UDP_TCP\\Files\\Client\\4.jpg");
        OutputStream os = socket.getOutputStream();
        byte[] bs = new byte[1024];
        int len = -1;
        while ((len = fis.read(bs))!= -1){
            os.write(bs,0,len);
        }
        // 3.关闭Socket的输出,表示数据传送完成
        socket.shutdownOutput();
        // 4.获取Socket输入流,读取服务器发来的反馈信息
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String message = br.readLine();
        System.out.println(message);
        // 5.关闭资源
        fis.close();
        socket.close();
    }
}
