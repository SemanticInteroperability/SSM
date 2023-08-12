package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lh
 * @date 2023/3/8 14:53
 */

@Controller
public class HelloController {

    @RequestMapping("/")
    // @RequestMapping("/")中的斜杠是绝对路径的标志，被服务器解析成http://localhost:8080/  +  上下文路径 spring_mvc/
    // http://localhost:8080/spring_mvc/
    //当使用@RequestMapping("/")注解后，此方法是处理请求的入口
    public String portal(){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "success";
    }
}
