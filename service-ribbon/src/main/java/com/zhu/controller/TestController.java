package com.zhu.controller;

import com.zhu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 11:56 2017/12/20
 */
@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return testService.hiService(name);
    }
}
