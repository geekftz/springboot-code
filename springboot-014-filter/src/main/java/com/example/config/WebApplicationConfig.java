package com.example.config;

import com.example.web.MyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterRegistration;

@Configuration
public class WebApplicationConfig {
    @Bean
    public FilterRegistrationBean<MyFilter> filterRegistrationBean() {
        FilterRegistrationBean<MyFilter> bean = new FilterRegistrationBean<MyFilter>();
        bean.setFilter(new MyFilter());
        bean.addUrlPatterns("/user/*");

        return bean;
    }
}
