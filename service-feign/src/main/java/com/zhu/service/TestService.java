package com.zhu.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhujf
 * @Description:
 * @Date: Created in 15:49 2017/12/19
 */
@FeignClient(value="eurekaclient", fallback = TestServiceHystric.class)
public interface TestService {
    @GetMapping("/hi")
    public String hi(@RequestParam(value="name") String name);
}
