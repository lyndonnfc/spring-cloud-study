package com.lyndon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyndon on 2018/4/16.
 */
@RestController
public class UserController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/getUser")
    public String getUser() {
        return "service" + discoveryClient.getServices();
    }
}
