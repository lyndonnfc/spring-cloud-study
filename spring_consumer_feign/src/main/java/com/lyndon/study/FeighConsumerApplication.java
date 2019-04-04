package com.lyndon.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Created by lyndon on 2018/4/18.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeighConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeighConsumerApplication.class, args);
    }
}
