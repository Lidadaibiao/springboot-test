package com.lidadaibiao.springboot.test3;

import com.lidadaibiao.springboot.test3.controller.SecondFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:58
 */
@SpringBootApplication
@ServletComponentScan
public class App4 {

    public static void main(String[] args) {
        SpringApplication.run(App4.class,args);
    }

    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
        bean.addUrlPatterns("/second");
        return bean;
    }
}
