package com.example.config;

import com.example.web.MyServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class WebSystemConfig {
    // 注册Servlet
    @Bean
    public ServletRegistrationBean<MyServlet> servletRegistrationBean() {
        MyServlet myServlet = new MyServlet();
        return new ServletRegistrationBean<MyServlet>(myServlet, "/myservlet");
    }


}
