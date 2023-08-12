package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lh
 * @date 2023/3/8 17:09
 *
 * 1、
 * @RequestMapping标识一个类：设置映射请求的请求路径的初始信息
 * @RequestMapping标识一个方法：设置映射请求请求路径的具体信息
 *
 * 2、@RequestMapping注解value属性
 *  * 作用：通过请求的请求路径匹配请求
 *  * value属性是数组类型，即当前浏览器所发送请求的请求路径匹配value属性中的任何一个值
 *  * 则当前请求就会被注解所标识的方法进行处理
 *  * 3、@RequestMapping注解的method属性
 *  * 作用：通过请求的请求方式匹配请求
 *  * method属性是RequestMethod类型的数组，即当前浏览器所发送请求的请求方式匹配method属性中的任何一中请求方式
 *  * 则当前请求就会被注解所标识的方法进行处理
 *  * 若浏览器所发送的请求的请求路径和@RequestMapping注解value属性匹配，但是请求方式不匹配
 *  * 此时页面报错：405 - Request method 'xxx' not supported
 *  不设置默认method属性，POST和GET都支持
 *  在@RequestMapping的基础上，结合请求方式的一些派生注解：
 *   @GetMapping,@PostMapping,@DeleteMapping,@PutMapping
 *
 *  4、 在@RequestMapping注解的value属性值中设置一些特殊字符
 *  * ?:任意的单个字符（不包括? 表示路径与请求参数的分隔符）
 *  * *:任意个数的任意字符（不包括?和/）
 *  * **:任意层数的任意目录，注意使用方式只能**写在双斜线中，前后不能有任何的其他字符
 *
 *  5、@RequestMapping注解使用路径中的占位符
 *  * 传统：/deleteUser?id=1
 *  * rest：/user/delete/1
 *  * 需要在@RequestMapping注解的value属性中所设置的路径中，使用{xxx}的方式表示路径中的数据
 *  * 在通过@PathVariable注解，将占位符所标识的值和控制器方法的形参进行绑定
 *
 *  6、通过控制器方法的形参获取
 *  * 只需要在控制器方法的形参位置，设置一个形参，形参的名字和请求参数的名字一致即可
 *
 *  7、@RequestParam：将请求参数和控制器方法的形参绑定
 *  * @RequestParam注解的三个属性：value、required、defaultValue
 *  * value:设置和形参绑定的请求参数的名字
 *  * required:设置是否必须传输value所对应的请求参数
 *  * 默认值为true，表示value所对应的请求参数必须传输，否则页面报错：
 *  * 400 - Required String parameter 'xxx' is not present
 *  * 若设置为false，则表示value所对应的请求参数不是必须传输，若为传输，则形参值为null
 *  * defaultValue:设置当没有传输value所对应的请求参数时，为形参设置的默认值，此时和required属性值无关
 *
 *  @RequestHeader：将请求头信息和控制器方法的形参绑定
 *  * 8、@CookieValue：将cookie数据和控制器方法的形参绑定
 *  * 9、通过控制器方法的实体类类型的形参获取请求参数
 *  * 需要在控制器方法的形参位置设置实体类类型的形参，要保证实体类中的属性的属性名和请求参数的名字一致
 *  * 可以通过实体类类型的形参获取请求参数
 *  * 10、解决获取请求此参数的乱码问题
 *  * 在web.xml中配置Spring的编码过滤器CharacterEncodingFilter
 */
@Controller
/*@RequestMapping("/test")*/
public class TestRequestMappingController {

    @RequestMapping(value = "/hello",
            method = {RequestMethod.POST,RequestMethod.GET})
    public String hello(){
        return "success";
    }


    @RequestMapping("/test/rest/{username}/{id}")
    public String testRest(@PathVariable("username") String username,@PathVariable("id") Integer id){
        System.out.println("id:"+ id+",username:"+username);
        return "success";
    }


    @RequestMapping("/param")
    public String getParam(@RequestParam(value = "userName", required = true, defaultValue = "hello") String username, String password){
        System.out.println("username:"+username+",password:"+password);
        return "success";
    }

}
