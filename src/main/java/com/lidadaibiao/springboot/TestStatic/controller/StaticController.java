package com.lidadaibiao.springboot.TestStatic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 访问静态资源 注意目录名称必须是 static
 * @author Lidadaibiao
 * @date 2020/5/31 - 22:32
 */
@Controller
public class StaticController {

    @RequestMapping("/static")
    public String Static(){
        return "index.html";
    }
}
