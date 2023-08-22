package com.example.config;

import com.example.web.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MyAppConfig implements WebMvcConfigurer {

    // 添加拦截器对象，注入到容器中
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        HandlerInterceptor interceptor = new LoginInterceptor();
        String[] path = {"/user/**"};
        String[] excludePath = {"/user/login"};
        registry.addInterceptor(interceptor).addPathPatterns(path).excludePathPatterns(excludePath);
        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
