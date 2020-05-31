package com.lidadaibiao.springboot.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:26
 */
@SpringBootApplication
@ServletComponentScan    //在 springBoot 启动时会扫描@WebServlet，并将该类实例 化
public class App1 {

    public static void main(String[] args) {
        SpringApplication.run(App1.class,args);
    }
}
