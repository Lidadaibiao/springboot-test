package com.lidadaibiao.springboot.test2.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 通过方法完成Servlet 组件的注册
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:37
 */
public class SecondServlet extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            req.setCharacterEncoding("utf-8");
            resp.setContentType("text/html;charset=utf-8");
            resp.getWriter().print("通过方法完成Servlet 组件的注册-----");
    }
}
