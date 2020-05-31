package com.lidadaibiao.springboot.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Lidadaibiao
 * @date 2020/5/31 - 21:22
 */
@Controller
public class TestController {

    @RequestMapping("test")
    @ResponseBody
    public  String test(){
        return "你好";
    }
}
