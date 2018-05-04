package com.oyid.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.oyid.dubbo.DemoService;

/**
 * @author zhw
 * @date 2018/5/3
 * Created by Administrator on 2018/5/3.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String s) {
        return "hello " + s + "!";
    }
}
