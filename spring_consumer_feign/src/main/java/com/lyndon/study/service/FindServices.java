package com.lyndon.study.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by lyndon on 2018/4/18.
 */
@FeignClient("eureka-client")
public interface FindServices {

    @GetMapping("/getUser")
    String findServices();
}
