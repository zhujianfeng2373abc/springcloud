package com.zhu.controller;

import com.zhu.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 15:51 2017/12/19
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/hi")
    public String hi(String name) {
        return testService.hi(name);
    }
}
