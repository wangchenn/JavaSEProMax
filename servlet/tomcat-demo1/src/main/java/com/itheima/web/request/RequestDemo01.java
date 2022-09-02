package com.itheima.web.request;

import jdk.swing.interop.SwingInterOpUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

@WebServlet("/req1")
public class RequestDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求方式
        var method = req.getMethod();
        System.out.println(method);
        //获取项目访问路径
        String contextPath = req.getContextPath();
        System.out.println(contextPath);
        //获取URL
        StringBuffer requestURL = req.getRequestURL();
        System.out.println(requestURL.toString());
        //获取资源唯一标识
        String requestURI = req.getRequestURI();
        System.out.println(requestURI);

        String queryString = req.getQueryString();
        System.out.println(queryString);
        // 请求头 浏览器版本信息
        String header = req.getHeader("user-agent");
        System.out.println(header);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取Post的请求体 请求参数
        //获取字符输入流
        BufferedReader br = req.getReader();
        //读取数据
        String s = br.readLine();
        System.out.println(s);
    }
}
