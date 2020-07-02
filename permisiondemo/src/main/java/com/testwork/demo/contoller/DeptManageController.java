package com.testwork.demo.contoller;

import com.testwork.demo.po.Dept;
import com.testwork.demo.service.IDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptManageController {

    @Autowired
    private IDeptService deptService;

    @RequestMapping("/queryAll")
    @ResponseBody
    public List<Dept> queryDeptAll(){
        return deptService.queryDeptAll();
    }

}
