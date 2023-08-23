package com.example.config;

import com.example.web.MyServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;

@Configuration
public class WebApplicationConfig {
    // 定义方法，注册Servlet对象
    @Bean
    public ServletRegistrationBean<MyServlet> servletRegistrationBean() {
        // ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<MyServlet>(new MyServlet(), "/myservlet");

        // return new ServletRegistrationBean<MyServlet>(new MyServlet(), "/myservlet");
        ServletRegistrationBean<MyServlet> bean = new ServletRegistrationBean<MyServlet>();
        bean.setServlet(new MyServlet());
        bean.addUrlMappings("/login", "/test");
        return bean;
    }
}

