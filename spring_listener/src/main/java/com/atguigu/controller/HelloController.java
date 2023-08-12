package com.atguigu.controller;

import com.atguigu.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author lh
 * @date 2023/3/15 19:49
 * Description:
 */

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

}
