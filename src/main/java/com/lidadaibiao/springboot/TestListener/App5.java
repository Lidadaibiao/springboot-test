package com.lidadaibiao.springboot.TestListener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 22:02
 */
@SpringBootApplication
@ServletComponentScan
public class App5 {

    public static void main(String[] args) {
        SpringApplication.run(App5.class,args);
    }
}
