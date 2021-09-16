package com.dao;

import com.pojo.Emp;

import java.util.List;

public interface EmpDao {
    // 查询所有员工
    List<Emp> findall();
    // 按编号查询
    Emp find(int id);
    // 添加
    void addemp(Emp emp);
    // 修改
    void updateemp(Emp emp);
    // 删除
    void deleteemp(int id);
}
