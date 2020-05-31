package com.lidadaibiao.springboot.test3.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:57
 */
@WebServlet(name = "SecondServlet",urlPatterns = "/second")
public class SecondServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("haha2");
    }
}
