package com.woody.springboot.dubbo.springbootdubbo.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.woody.springboot.dubbo.springbootdubbo.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Woody Black
 * @Date 2021/1/17 17:08
 */
@Component
public class HelloConsumer {

    @Reference(url = "dubbo://localhost:20880")
    private HelloService helloService;

    public void say(String msg) {
        System.out.println(helloService.sayHello(msg));
    }

}
