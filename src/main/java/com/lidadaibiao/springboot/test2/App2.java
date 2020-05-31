package com.lidadaibiao.springboot.test2;

import com.lidadaibiao.springboot.test2.controller.SecondServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:38
 */
@SpringBootApplication
public class App2 {

    public static void main(String[] args) {
        SpringApplication.run(App2.class,args);
    }

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new SecondServlet());
        bean.addUrlMappings("/second");
        return bean;
    }
}
