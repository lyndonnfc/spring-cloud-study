package com.lyndon.controller;

import com.lyndon.entiy.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyndon on 2018/4/16.
 */
@RestController
@RequestMapping("/test")
public class UserTestController {

    @Autowired
    DiscoveryClient discoveryClient;

    @GetMapping("/getUser")
    public String getUser() {
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        List<TestUser> list = new ArrayList<>();
        TestUser testUser1 = new TestUser();
        testUser1.setUid(1L);
        testUser1.setUserName("测试1");
        TestUser testUser2 = new TestUser();
        testUser2.setUid(2L);
        testUser2.setUserName("测试2");
        list.add(testUser1);
        list.add(testUser2);
        return "service" + list.get(2);
    }

    @GetMapping("/getUserInfo")
    public TestUser getUserInfo() {
        TestUser testUser = new TestUser();
        testUser.setUid(1L);
        testUser.setUserName("测试");
        return testUser;
    }

    @GetMapping("/getUserList")
    public List<TestUser> getUserList() {
        List<TestUser> list = new ArrayList<>();
        TestUser testUser1 = new TestUser();
        testUser1.setUid(1L);
        testUser1.setUserName("测试1");
        TestUser testUser2 = new TestUser();
        testUser2.setUid(2L);
        testUser2.setUserName("测试2");
        list.add(testUser1);
        list.add(testUser2);
        return list;
    }
}
