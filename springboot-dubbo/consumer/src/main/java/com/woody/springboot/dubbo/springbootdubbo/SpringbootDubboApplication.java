package com.woody.springboot.dubbo.springbootdubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.woody.springboot.dubbo.springbootdubbo.impl.HelloConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDubboApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootDubboApplication.class, args);
        HelloConsumer helloConsumer = (HelloConsumer) applicationContext.getBean("helloConsumer");
        helloConsumer.say("Woody");
    }

}
