package com.woody.springboot.dubbo.springbootdubbo.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.woody.springboot.dubbo.springbootdubbo.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Woody Black
 * @Date 2021/1/17 17:04
 */
@Component
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String msg) {
        return msg + " go ahead!";
    }
}
