package com.atguigu.mybatis.test;

import com.atguigu.mybatis.mapper.UserMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisTest {
    @Test
    public void testInsert() throws IOException {

        //1.配置核心配置文件的输入流
        InputStream is = Resources.getResourceAsStream("mybatis_config.xml");

        //2.获取sqlSessionFactoryBuilder对象
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

        //3.获取sqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(is);

        //4.获取sql的会话对象sqlSession，是Mybatis提供的操作数据库的对象
        SqlSession sqlSession = sqlSessionFactory.openSession(true);//自动提交事务

        //5.获取UserMapper的代理实现类对象,底层是创建UserMapper接口的实现类 代理模式
        // <T> T getMapper(Class<T> type);
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        //调用mapper接口中的方法，实现添加用户信息的功能
        int rs = mapper.insertUser();
        if (rs>0){
            System.out.println("插入成功！");
        }
        //提交事务
        //sqlSession.commit();

        sqlSession.close();
    }

    @Test
    public void updateTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int rs = mapper.updateUser();
        if (rs>0){
            System.out.println("修改成功！");
        }
        sqlSession.close();
    }

    @Test
    public void deleteTest(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int rs = mapper.deleteUser();
        if (rs>0){
            System.out.println("删除成功！");
        }
        sqlSession.close();
    }

    @Test
    public void selectTest1(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById();
        System.out.println(user);
    }

    @Test
    public void selectTest2(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        userList.forEach(System.out::println);

    }
}
