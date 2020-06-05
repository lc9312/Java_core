package com.itheima.http;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

@WebServlet(
        urlPatterns = "/demo01")
public class Myservlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        try {
            System.out.println(InetAddress.getLocalHost().getHostName());
            System.out.println(Inet4Address.getLocalHost().toString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        System.out.println("哈哈,你是一个麻瓜!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("上下上下左右左右,BABA!");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=utf-8");
        servletResponse.getWriter().print("麻瓜麻瓜,你是超级大麻瓜!");
        servletResponse.getWriter().print("欢迎来到德莱联盟!");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String browerName = request.getHeader("user-agent");
        System.out.println("所使用浏览器为:"+browerName);

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
