package com.testwork.demo.dao;

import com.testwork.demo.po.Dept;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component("deptDao")
@Repository
public interface IDeptDao {

    /**
     * 查询所有的部门
     * @return
     */
    List<Dept> queryDeptAll();
}
