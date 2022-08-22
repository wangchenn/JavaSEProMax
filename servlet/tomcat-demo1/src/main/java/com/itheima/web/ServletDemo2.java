package com.itheima.web;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * @author wangchen
 */
@WebServlet("/demo2")
public class ServletDemo2 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) {
        System.out.println("init 。。。。");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) {
        System.out.println("Servlet hello world!");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
