package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author lh
 * @date 2023/3/8 17:12
 */

@Controller
public class PortalController {

    @RequestMapping("/")
    public String portal(){
        return "index";
       
    }
}
