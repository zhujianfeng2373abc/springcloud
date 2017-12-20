package com.zhu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 14:04 2017/12/19
 */
@RestController
@ConfigurationProperties(prefix = "server")
public class TestController {

    private String port;

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @GetMapping("/hi")
    public String hi(String name) {
        return "hi " + name + ", I am from port : " + port;
    }

}
