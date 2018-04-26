package com.lyndon.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyndon on 2018/4/26.
 */
@RestController
public class ConfigClientController {

    @Value("${foo}")
    private String test;

    @GetMapping(value = "/hi")
    public String getTest() {
        return "";
    }
}
