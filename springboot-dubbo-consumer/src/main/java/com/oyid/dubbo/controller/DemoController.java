package com.oyid.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.oyid.dubbo.DemoService;
import com.oyid.dubbo.serviceConsumer.DemoConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhw
 * @date 2018/5/3
 * Created by Administrator on 2018/5/3.
 */
@RestController
public class DemoController {

    @Autowired
    private DemoConsumerService demoConsumerService;

    @Reference(version = "1.0.0")
    public DemoService demoService;

    @RequestMapping("/sayHello")
    public String sayHello(@RequestParam String name) {
        return demoConsumerService.sayHello(name);
    }

    @RequestMapping("/sayHello1")
    public String sayHello1(@RequestParam String name) {
        return demoService.sayHello(name);
    }
}
