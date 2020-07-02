package com.springredis.demo.service.impl;

import com.springredis.demo.po.User;
import com.springredis.demo.service.ITestRedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class TestRedisService implements ITestRedisService {

    @Autowired
    private RedisTemplate<String,  String> redisTemplate;

//    @Autowired
//    private  RedisTemplate<Object,  Object>  redisTemplate;

    public String getPeople(){
//        User user = (User)redisTemplate.opsForValue().get("people");
//        String message =  user.toString();
        String message = redisTemplate.opsForValue().get("lxp");
        return message;
    }



}
