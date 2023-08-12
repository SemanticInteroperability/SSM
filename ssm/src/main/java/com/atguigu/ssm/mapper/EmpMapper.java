package com.atguigu.ssm.mapper;

import com.atguigu.ssm.pojo.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/16 9:08
 * Description:
 */
public interface EmpMapper {

    /**
     * 查询所有员工信息
     * @return
     */
    List<Emp> getAllEmpList();


}
