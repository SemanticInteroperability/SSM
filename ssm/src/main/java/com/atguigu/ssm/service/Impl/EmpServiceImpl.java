package com.atguigu.ssm.service.Impl;

import com.atguigu.ssm.mapper.EmpMapper;
import com.atguigu.ssm.pojo.Emp;
import com.atguigu.ssm.service.EmpService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/15 21:56
 * Description:
 * 查询所有的员工信息-->/employee-->get
 *  * 查询员工的分页信息-->/employee/page/1-->get
 *  * 根据id查询员工信息-->/employee/1-->get
 *  * 跳转到添加页面-->/to/add-->get
 *  * 添加员工信息-->/employee-->post
 *  * 修改员工信息-->/employee-->put
 *  * 删除员工信息-->/employee/1-->delete
 */

@Service
@Transactional
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    /**
     * 查询所有员工信息
     * @return
     */
    public List<Emp> getAllEmp() {
        return empMapper.getAllEmpList();
    }


    /**
     * 根据分页插件查询所有员工信息
     * @return
     * @param pageNum
     */
    public PageInfo<Emp> getEmpByPage(Integer pageNum) {
        //在查询功能之前使用PageHelper.startPage(int pageNum, int pageSize)开启分页功能
        PageHelper.startPage(pageNum,4);
        //查询所有的员工信息
        List<Emp> empList = empMapper.getAllEmpList();
        //在查询获取list集合之后，获取分页相关数据
        PageInfo<Emp> pageInfo = new PageInfo(empList,5);
        System.out.println(pageInfo);
        return pageInfo;
    }
}
