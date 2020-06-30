package com.testwork.demo.service;

import com.testwork.demo.po.Dept;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
@MapperScan("com.testwork.demo.dao")
class IDeptServiceTest {
    @Autowired
    private IDeptService deptService;

    @Test
    public void queryDeptAllTest(){
        List<Dept> depts = deptService.queryDeptAll();
        System.out.println(depts.size());
    }
}