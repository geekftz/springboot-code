package com.example;

import com.example.service.HelloService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class Springboot011CommandlinerunnerApplication implements CommandLineRunner {

    @Resource
    private HelloService helloService;

    public static void main(String[] args) {
        SpringApplication.run(Springboot011CommandlinerunnerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String str = helloService.sayHello("zhangsan");
        System.out.println("调用容器中的对象" + str);
        System.out.println("容器对象创建好后 ，执行的方法");
    }
}
