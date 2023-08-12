package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 返回的是一个实体对象，实体属性必须和数据库的字段名一致
     * @param id
     * @return
     */
    User getUserById(@Param("id") Integer id);

    List<User> getUserList();

    Integer getUserCount();

    /**
     * 根据id查询用户信息为map集合
     * 以字段名为key，不必跟实体属性一致
     * 大多采用这种以map为返回类型的查询
     * @param id
     * @return
     */
    Map<String,Object> getUserByIdToMap(@Param("id") Integer id);

    /**
     * 查询所有的用户信息为map集合
     * 若查询的数据有多条时，并且要将每条数据转换为map集合
     * 此时有两种解决方案：
     * 1、将mapper接口方法的返回值设置为泛型是map的list集合
     *  List<Map<String,Object>>  getUsersMap();
     * 结果：{password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin},{password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin}
     * 2、可以将每条数据转换的map集合放在一个大的map中，但是必须要通过@MapKey注解
     * 将查询的某个字段的值作为大的map的键
     * @MapKey("id")
     * Map<String, Object> getAllUserToMap();
     * 结果：
     * {
     *  1={password=123456, gender=男, id=1, age=23, email=12345@qq.com, username=admin},
     *  2={password=123, gender=男, id=2, age=23, email=12345@qq.com, username=zhangsan},
     *  3={password=123456, gender=女, id=3, age=33, email=123@qq.com, username=root},
     *  4={password=123, id=4, username=lisi}
     *  }
     */

//    List<Map<String,Object>>  getUsersMap();

    /**
     * {1={role=0, uname=DJsb, id=1, pwd=123123, email=dj2023@qq.com}, 4={role=0, uname=sbdj, id=4, pwd=123123, email=dj2023@qq.com},
     * 5={role=0, uname=clearlove, id=5, pwd=5201314, email=321@qq.com}, 6={role=0, uname=Fmt, id=6, pwd=5201314, email=321@qq.com}}
     * 通过@MapKey("id")注解把id作为大map集合的key，把当前数据转换的map集合作为大map的value
     * @return
     */
    @MapKey("id")
    Map<String,Object> getUsersMap();
}
