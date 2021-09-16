package com.service.impl;

import com.dao.EmpDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pojo.Emp;
import com.service.EmpService;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpDao empDao;

    @Override
    public List<Emp> findall() {
        List<Emp> emps = empDao.findall();
        return emps;
    }

    @Override
    public Emp find(int id){
        return empDao.find(id);
    }

    @Override
    public void addemp(Emp emp) {
        empDao.addemp(emp);
    }

    @Override
    public void updateemp(Emp emp) {
        empDao.updateemp(emp);
    }

    @Override
    public void deleteemp(int id) {
        empDao.deleteemp(id);
    }
}
