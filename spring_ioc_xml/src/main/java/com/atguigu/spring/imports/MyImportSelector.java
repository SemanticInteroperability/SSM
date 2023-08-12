package com.atguigu.spring.imports;

import com.atguigu.spring.beans.OtherBean2;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lh
 * @date 2023/7/25 10:11
 * Description:
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        //返回的数组封装的是需要被注册到Spring容器中的Bean的全限定名
        return new String[]{OtherBean2.class.getName()};
    }
}
