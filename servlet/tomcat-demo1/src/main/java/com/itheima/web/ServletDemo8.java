package com.itheima.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author wangchen
 * urlPattern 一个servlet可以配置多个访问路径
 * 精确匹配
 */
//精确匹配 优先级相比其他更高
//@WebServlet(urlPatterns = "/user/select")
///**目录匹配*/
//@WebServlet(urlPatterns = "/user/*")
/**扩展名匹配*/
@WebServlet(urlPatterns = "/user/*.do")
public class ServletDemo8 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("demo8 get --------");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
