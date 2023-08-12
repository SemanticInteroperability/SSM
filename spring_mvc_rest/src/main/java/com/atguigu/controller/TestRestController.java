package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author lh
 * @date 2023/3/13 9:46
 *
 *  注意：浏览器目前只能发送get和post请求
 *  * 若要发送put和delete请求，需要在web.xml中配置一个过滤器HiddenHttpMethodFilter
 *  * 配置了过滤器之后，发送的请求要满足两个条件，才能将请求方式转换为put或delete
 *  * 1、当前请求的请求方式必须为post
 *  * 2、当前请求必须传输请求参数_method，_method的值才是最终的请求方式
 */

@Controller
public class TestRestController {

    @GetMapping(value = "/user")
    public String getAllUser(){
        System.out.println("查询所有用户信息->/user-->get");
        return "success";
    }

    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("查询id为："+id+"的用户信息->/user-->get");
        return "success";
    }

    @PostMapping("/user")
    public String insertUser(){
        System.out.println("添加用户信息->/user-->post");
        return "success";
    }

    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public String updateUser(){
        System.out.println("修改用户信息->/user-->put");
        return "success";
    }


    @DeleteMapping(value = "/user/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
        System.out.println("删除id为："+id+"的用户信息->/user-->delete");
        return "success";
    }
}
