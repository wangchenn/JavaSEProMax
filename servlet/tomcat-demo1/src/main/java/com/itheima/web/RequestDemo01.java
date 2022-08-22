package com.itheima.web;

import jdk.swing.interop.SwingInterOpUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
