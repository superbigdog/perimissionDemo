package com.springredis.demo.service.impl;

import com.springredis.demo.service.ITestRedisService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
class TestRedisServiceTest {

    @Autowired
    private ITestRedisService testRedisService;

    @Test
    public void getPeople() {
        System.out.println(testRedisService.getPeople());
    }
}