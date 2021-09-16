package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.pojo.Emp;
import com.service.EmpService;

import java.util.List;

@Controller
@RequestMapping("/Emp")
public class EmpController {
    @Autowired
    private EmpService empService;


    // 所有员工列表信息
    @RequestMapping("/allEmp")
    public String List(Model model){
        List<Emp> list;
        list = empService.findall();
        model.addAttribute("list",list);
        return "allEmp";
    }

    // 跳转添加员工按钮
    @RequestMapping("toaddEmp")
    public String toaddEmp(){
        return "addEmp";
    }

    // 添加员工页面
    @RequestMapping("/addEmp")
    public String addEmp(Emp emp){
        empService.addemp(emp);
        return "redirect:/Emp/allEmp";
    }

    // 删除员工按钮
    @RequestMapping("/del/{empid}")
    public String deleteemp(@PathVariable("empid") int id){
        empService.deleteemp(id);
        return "redirect:/Emp/allEmp";
    }

    // 跳转更新员工按钮
    @RequestMapping("toupdateEmp")
    public String toupdateemp(Model model,int id){
        System.out.println("1");
        model.addAttribute("emp",empService.find(id));
        System.out.println("2");
        return "updateEmp";
    }

    // 员工更新界面
    @RequestMapping("/updateEmp")
    public String updateemp(Model model,Emp emp){
        empService.updateemp(emp);
        emp = empService.find(emp.getEmpid());
        model.addAttribute("emp",emp);
        return "redirect:/Emp/allEmp";
    }
}
