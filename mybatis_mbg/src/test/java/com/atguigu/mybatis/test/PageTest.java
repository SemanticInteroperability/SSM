package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageTest {
    @Test
    public void TestPage(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        //查询功能开启之前开启分页功能
        Page<Object> page = PageHelper.startPage(1, 4);
        List<Emp> emps = mapper.selectByExample(null);
        //查询功能之后可以获取分页相关的所有数据
        PageInfo<Object> pageInfo = new PageInfo(emps,2);
        emps.forEach(System.out::println);
        System.out.println(pageInfo);
    }
}
