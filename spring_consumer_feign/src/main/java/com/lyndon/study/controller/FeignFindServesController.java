package com.lyndon.study.controller;

import com.lyndon.study.service.FindServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lyndon on 2018/4/18.
 */
@RestController
public class FeignFindServesController {

    @Autowired
    private FindServices findServices;

    @GetMapping("/findService")
    public String findServices() {
        return findServices.findServices();
    }
}
