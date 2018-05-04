package com.oyid.dubbo.serviceConsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.oyid.dubbo.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author zhw
 * @date 2018/5/4
 * Created by Administrator on 2018/5/4.
 */
@Component
public class DemoConsumerService {

    @Reference(version = "1.0.0")
    public DemoService demoService;

    public String sayHello(String name) {
        return demoService.sayHello(name);
    }
}
