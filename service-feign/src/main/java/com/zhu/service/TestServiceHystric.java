package com.zhu.service;

import org.springframework.stereotype.Component;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 9:30 2017/12/20
 */
@Component
public class TestServiceHystric implements TestService {
    @Override
    public String hi(String name) {
        return "sorry "+name;
    }
}
