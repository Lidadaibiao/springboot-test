package com.lidadaibiao.springboot.test3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:44
 */
@SpringBootApplication
@ServletComponentScan
public class App3 {

    public static void main(String[] args) {
        SpringApplication.run(App3.class,args);
    }
}
