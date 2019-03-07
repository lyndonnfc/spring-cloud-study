package com.lyndon.study.component;

import com.lyndon.study.service.FindServices;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lyndon on 2019/3/7.
 */
@Component
public class FindServicesHystrix implements FindServices{
    @Override
    public String findServices() {
        return "service is dead";
    }

    @Override
    public Object getUserInfo() {
        return new Object();
    }

    @Override
    public List getUserList() {
        List<String> s = new ArrayList<>();
        s.add("fail");
        s.add("error");
        return s;
    }
}
