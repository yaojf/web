package com.yaojiafeng.springboot.web.controller;

/**
 * Created by yaojiafeng on 2018/9/8 下午1:46.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String show() {
        return "Hello World";
    }
}
