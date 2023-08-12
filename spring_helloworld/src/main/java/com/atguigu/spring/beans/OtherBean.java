package com.atguigu.spring.beans;

import com.atguigu.spring.anno.MyComponent;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author lh
 * @date 2023/7/20 11:30
 * Description:
 */

@MyComponent("OtherBean")
public class OtherBean  {
    public OtherBean(){
        System.out.println("OtherBean无参构造实例化");
    }


}
