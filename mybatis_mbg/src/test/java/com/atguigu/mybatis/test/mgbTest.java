package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.EmpMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.pojo.EmpExample;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class mgbTest {
    @Test
    public void InsertTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = new Emp(null,"小明",22,"女");
//        mapper.insert(emp);
//        Emp emp = mapper.selectByPrimaryKey(1);
//        System.out.println(emp);
//        EmpExample example = new EmpExample();
//        example.createCriteria().andAgeGreaterThan(22).andGenderEqualTo("男");
//        example.or().andDeptIdEqualTo(2);
//        List<Emp> emps = mapper.selectByExample(example);
//        emps.forEach(System.out::println);

        //测试普通修改功能
        Emp emp = new Emp(1,"小明",null,"男");
        //mapper.updateByPrimaryKey(emp);
        //测试选择性修改
        mapper.updateByPrimaryKeySelective(emp);
        System.out.println(emp);
        sqlSession.close();
    }
}
