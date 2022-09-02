package com.itheima.web.request;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * @author wangchen
 */
@WebServlet("/demo3")
public class ServletDemo3 implements Servlet {
    private ServletConfig config;
    @Override
    public void init(ServletConfig servletConfig) {
        this.config = servletConfig;
        System.out.println("init 。。。。");
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
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
