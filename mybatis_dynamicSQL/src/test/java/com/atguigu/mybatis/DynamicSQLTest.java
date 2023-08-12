package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.DynamicSQLMapper;
import com.atguigu.mybatis.pojo.Emp;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class DynamicSQLTest {
    @Test
    public void dynamicSQLTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null,"",22,"");
        List<Emp> emps = mapper.getEmpCondition(emp);
        emps.forEach(System.out::println);
    }

    @Test
    public void InsertBatchEmpsTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        List<Emp> emps = new ArrayList<>();
        for (int i=0;i<5;i++){
            Emp emp = new Emp(null,"小明"+i,22+i,"女");
            emps.add(emp);
        }
       mapper.insertBatchEmps(emps);
        sqlSession.close();
    }

    @Test
    public void DeleteBatchEmpsTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empId =  new Integer[]{5,6,7,8,9};
        mapper.deleteBatchEmps(empId);
        sqlSession.close();
    }
}
