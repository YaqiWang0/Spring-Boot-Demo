package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx=SpringApplication.run(DemoApplication.class, args);
        MyAppConfig config=(MyAppConfig)ctx.getBean("myAppConfig");
        System.out.println(config);
    }

}
