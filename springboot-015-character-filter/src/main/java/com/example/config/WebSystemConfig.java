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

    @Bean
    public FilterRegistrationBean<CharacterEncodingFilter> filterFilterRegistrationBean() {
        FilterRegistrationBean<CharacterEncodingFilter> reg = new FilterRegistrationBean<CharacterEncodingFilter>();

        // 使用框架中的过滤器类
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        // 指定编码格式
        filter.setEncoding("utf-8");
        filter.setForceEncoding(true);

        reg.setFilter(filter);

        // 指定过滤的url地址
        reg.addUrlPatterns("/*");

        return reg;
    }
}
