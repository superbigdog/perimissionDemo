package com.springredis.demo.controller.impl;

import com.springredis.demo.service.ITestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/redis")
public class TestRedisController {

    @Autowired
    private ITestRedisService testRedisService;

    @RequestMapping("/getlxp")
    @ResponseBody
    public String getLxp(){
        System.out.println("ok");
        return testRedisService.getPeople();
    }
}
