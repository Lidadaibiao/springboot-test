package com.lidadaibiao.springboot.TestListener.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 通过注解扫描完成 Listener 组件的注册
 * @author Lidadaibiao
 * @date 2020/5/31 - 22:03
 */
@WebListener
public class FristListener implements ServletContextListener {

    //监听服务的创建和销毁


    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听监听，服务器启动");
    }

    public void contextDestroyed(ServletContextEvent sce) {

    }
}
