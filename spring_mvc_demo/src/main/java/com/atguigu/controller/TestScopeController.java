package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author lh
 * @date 2023/3/9 15:26
 *
 * 向域对象共享数据：
 *  * 1、通过ModelAndView向请求域共享数据
 *  * 使用ModelAndView时，可以使用其Model功能向请求域共享数据
 *  * 使用View功能设置逻辑视图，但是控制器方法一定要将ModelAndView作为方法的返回值
 *    2、使用Model向请求域共享数据
 *  * 3、使用ModelMap向请求域共享数据
 *  * 4、使用map向请求域共享数据
 *  * 5、Model和ModelMap和map的关系
 *  * 其实在底层中，这些类型的形参最终都是通过BindingAwareModelMap创建
 *  * public class BindingAwareModelMap extends ExtendedModelMap {}
 *  * public class ExtendedModelMap extends ModelMap implements Model {}
 *  * public class ModelMap extends LinkedHashMap<String, Object> {}
 */

@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMav(){
        /**
         *  ModelAndView 包含Model和View的功能
         *  Model：向请求域中共享数据
         *  View： 设置逻辑视图实现页面跳转
         */
        ModelAndView mav = new ModelAndView();
        mav.addObject("testRequestScope","hello,ModelAndView");
        mav.setViewName("success");
        return mav;
    }

    @RequestMapping("/test/model")
    public String  TestModel(Model model){
        model.addAttribute("testRequestScope","hello,model");
        return "success";
    }

    @RequestMapping("/test/modelMap")
    public String  TestModelMap(ModelMap modelMap){
        modelMap.addAttribute("testRequestScope","hello,modelMap");
        return "success";
    }

    @RequestMapping("/test/map")
    public String  TestMap(Map<String,Object> map){
        map.put("testRequestScope","hello,Map");
        return "success";
    }
}
