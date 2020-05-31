package com.lidadaibiao.springboot.TestListener;

import com.lidadaibiao.springboot.TestListener.controller.SecondListener;
import com.lidadaibiao.springboot.TestListener.controller.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 *
 * 通过方法完成 Listener 组件注册
 * @author Lidadaibiao
 * @date 2020/5/31 - 22:02
 */
@SpringBootApplication
public class App6 {

    public static void main(String[] args) {
        SpringApplication.run(App6.class,args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean<SecondListener> getServletListenerRegistrationBean(){
        ServletListenerRegistrationBean<SecondListener> bean =
                new ServletListenerRegistrationBean<SecondListener>(new SecondListener());
        return bean;
    }

}
