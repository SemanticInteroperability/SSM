package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DynamicSQLMapper {
    /**
     * 根据条件查询员工信息
     * @param emp
     * @return
     */
    List<Emp> getEmpCondition(Emp emp);

    /**
     * 批量插入员工信息
     * @param emps
     */
    void insertBatchEmps(@Param("emps") List<Emp> emps);


    /**
     * 批量删除
     * @param empIds
     */
    void deleteBatchEmps(@Param("empIds") Integer[] empIds);
}
