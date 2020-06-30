package com.testwork.demo.service.impl;

import com.testwork.demo.dao.IDeptDao;
import com.testwork.demo.po.Dept;
import com.testwork.demo.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("deptService")
public class DeptService implements IDeptService {

    public DeptService(){
        System.out.println("创建了一个service");
    }

    @Autowired
    private IDeptDao deptDao;

    @Override
    public List<Dept> queryDeptAll() {
        return deptDao.queryDeptAll();
    }
}
