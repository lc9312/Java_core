package com.itheima.tcp.fileUpload.first;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端
 */
public class Client01 {
    public static void main(String[] args) throws Exception{
        // 1. 创建Socket,指定要连接的服务器IP和应用程序端口
        Socket socket = new Socket(InetAddress.getLocalHost(),9112);
        FileInputStream fis = null;

        for (int i = 2;i <= 4;i++) {
            // 2. 获取本地文件输入流,Socket输出流
            fis = new FileInputStream("day01_UDP_TCP\\Files\\Client\\"+i+".jpg");
            OutputStream  os = socket.getOutputStream();

            // 3. 将本地文件向服务器输出
            byte[] bs = new byte[1024];
            int len = -1;
            while ((len = fis.read(bs))!= -1){
                os.write(bs,0,len);
            }

            // 提示传送完毕
            if(i == 4) {
                socket.shutdownOutput();
            }
        }
// 4.获取服务器反馈
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String message = "";
        while ((message =br.readLine())!= null){
            System.out.print("文件:"+message);
        }
        // 5.关闭资源
        fis.close();
        socket.close();
    }
}
