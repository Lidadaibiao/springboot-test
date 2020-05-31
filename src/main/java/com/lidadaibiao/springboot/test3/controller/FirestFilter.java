package com.lidadaibiao.springboot.test3.controller;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * 通过注解扫描完成Filter 组件的注册
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:45
 */
@WebFilter(filterName = "FirestFilter",urlPatterns = "/first")
public class FirestFilter extends HttpFilter{
    @Override
    public void init() throws ServletException {
        System.out.println("开启FirestFilter");
    }

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("进");
        chain.doFilter(request,response);
        System.out.println("出");
    }

    public void destroy() {
        System.out.println("退出FirestFilter");
    }
}
