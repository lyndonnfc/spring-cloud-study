package com.lyndon.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by lyndon on 2018/4/18.
 */
@RestController
public class ServiceFindController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/ribbon/test")
    public String serviceFind() {
        return restTemplate.getForObject("http://eureka-client/getUser",String.class);
    }
}
