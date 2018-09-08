package com.yaojiafeng.springboot.web.controller;

/**
 * Created by yaojiafeng on 2018/9/8 下午1:46.
 */

import com.yaojiafeng.springboot.web.dao.DabaojianRepository;
import com.yaojiafeng.springboot.web.entity.Dabaojian;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private DabaojianRepository dabaojianRepository;

    @RequestMapping("/")
    public String show() {
        return "Hello World";
    }


    @RequestMapping("/incr")
    public Long incr() {
        return stringRedisTemplate.opsForValue().increment("shengge", 1);
    }

    @RequestMapping("/get")
    public String get() {
        return stringRedisTemplate.opsForValue().get("shengge");
    }

    @RequestMapping("/dabaojian")
    public List<Dabaojian> dabaojian() {
        return dabaojianRepository.findAll();
    }

}
