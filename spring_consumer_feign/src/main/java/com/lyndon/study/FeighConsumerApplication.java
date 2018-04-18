package com.lyndon.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by lyndon on 2018/4/18.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class FeighConsumerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(FeighConsumerApplication.class)
                .web(true).run(args);
    }
}
