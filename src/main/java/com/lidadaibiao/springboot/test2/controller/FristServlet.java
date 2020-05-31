package com.lidadaibiao.springboot.test2.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 *
 * ，通过注解扫描完成Servlet 组件的注册
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:27
 */
@WebServlet(name = "FristServlet",urlPatterns = "/first")
public class FristServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().print("通过注解扫描完成Servlet 组件的注册");
    }
}
