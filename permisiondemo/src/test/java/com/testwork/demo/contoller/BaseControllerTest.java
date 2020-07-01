package com.testwork.demo.contoller;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
@MapperScan("com.testwork.demo.dao")
public class BaseControllerTest {


    @BeforeEach
    public void init() {
        System.out.println("开始测试...");
    }

    @AfterEach
    public void after() {
        System.out.println("测试结束...");
    }
}
