package com.lyndon.study.service;

import com.lyndon.study.component.FindServicesHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created by lyndon on 2018/4/18.
 */
@FeignClient(value = "eureka-client",fallback = FindServicesHystrix.class)
public interface FindServices {

    @GetMapping("/getUser")
    String findServices();

    @GetMapping("/getUserInfo")
    Object getUserInfo();

    @GetMapping("/getUserList")
    List getUserList();
}
