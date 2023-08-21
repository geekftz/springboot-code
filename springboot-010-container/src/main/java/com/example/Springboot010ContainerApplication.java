package com.example;

import com.example.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot010ContainerApplication {

    public static void main(String[] args) {
        // 获取容器对象
        ConfigurableApplicationContext ctx = SpringApplication.run(Springboot010ContainerApplication.class, args);

        // 从容器中获取对象
        UserService userService = (UserService) ctx.getBean("userService");

        userService.sayHello("lily");
    }

}
