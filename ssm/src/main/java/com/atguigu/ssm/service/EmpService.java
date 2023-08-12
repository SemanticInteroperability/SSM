package com.atguigu.ssm.service;

import com.atguigu.ssm.pojo.Emp;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/15 21:56
 * Description:
 * 查询所有的员工信息-->/employee-->get
 *  *  * 查询员工的分页信息-->/employee/page/1-->get
 *  *  * 根据id查询员工信息-->/employee/1-->get
 *  *  * 跳转到添加页面-->/to/add-->get
 *  *  * 添加员工信息-->/employee-->post
 *  *  * 修改员工信息-->/employee-->put
 *  *  * 删除员工信息-->/employee/1-->delete
 */
public interface EmpService {

    List<Emp> getAllEmp();

    PageInfo<Emp> getEmpByPage(Integer pageNum);
}
