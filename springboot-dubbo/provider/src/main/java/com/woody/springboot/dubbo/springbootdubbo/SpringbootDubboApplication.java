package com.woody.springboot.dubbo.springbootdubbo;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class SpringbootDubboApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboApplication.class, args);
    }

}
