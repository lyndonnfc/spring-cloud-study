package com.lyndon.study.controller;

import com.lyndon.study.service.FindServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/getUserInfo")
    public Object getUserInfo() {
        return findServices.getUserInfo();
    }

    @GetMapping("/getUserList")
    public List getUserList() {
        return findServices.getUserList();
    }
}
