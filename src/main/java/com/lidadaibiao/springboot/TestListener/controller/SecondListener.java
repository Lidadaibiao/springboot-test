package com.lidadaibiao.springboot.TestListener.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 22:11
 */
public class SecondListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("监听，监听，服务器2启动");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("监听，监听，服务器2消灭");
    }
}
