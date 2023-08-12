package com.atguigu.ssm.controller;

import com.atguigu.ssm.pojo.Emp;
import com.atguigu.ssm.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author lh
 * @date 2023/3/15 21:45
 * Description:
 * 查询所有的员工信息-->/employee-->get
 *  * 查询员工的分页信息-->/employee/page/1-->get
 *  * 根据id查询员工信息-->/employee/1-->get
 *  * 跳转到添加页面-->/to/add-->get
 *  * 添加员工信息-->/employee-->post
 *  * 修改员工信息-->/employee-->put
 *  * 删除员工信息-->/employee/1-->delete
 */

@Controller
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/employee")
    public String getAllEmp(Model model){
        List<Emp> empList = empService.getAllEmp();
        model.addAttribute("empList",empList);
        return "employee_list1";
    }

    @GetMapping("/employee/page/{pageNum}")
    public String getEmpPage(@PathVariable("pageNum") Integer pageNum,Model model){
        PageInfo<Emp> page = empService.getEmpByPage(pageNum);
        model.addAttribute("page",page);
        return "employee_list";
    }
}
