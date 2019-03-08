package com.lyndon.study;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by lyndon on 2019/3/8.
 */
@SpringBootApplication
public class GatewayServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(GatewayServerApplication.class)
                .web(true).run(args);
    }
}
