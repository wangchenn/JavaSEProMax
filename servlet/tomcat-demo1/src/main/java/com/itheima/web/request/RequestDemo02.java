package com.itheima.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/req2")
public class RequestDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //GET请求逻辑
        //获取所有参数的Map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            System.out.print(key+":");
            String[] values = map.get(key);
            for (String value : values) {
                System.out.print(value+" ");
            }
            System.out.println("====================");
            String[] hobbies = req.getParameterValues("hobby");
            for (String hobby : hobbies) {
                System.out.println(hobby);
            }
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            System.out.println(username);
            System.out.println(password);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        this.doGet(req,resp);
        //GET请求逻辑
        //获取所有参数的Map集合
        Map<String, String[]> map = req.getParameterMap();
        for (String key : map.keySet()) {
            System.out.print(key+":");
            String[] values = map.get(key);
            for (String value : values) {
                System.out.print(value+" ");
            }
            System.out.println("====================");
            String[] hobbies = req.getParameterValues("hobby");
            for (String hobby : hobbies) {
                System.out.println(hobby);
            }
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            System.out.println(username);
            System.out.println(password);
        }
    }
}
