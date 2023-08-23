package com.example.web;

import javax.servlet.*;
import java.io.IOException;

public class MyFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("execute MyFilter");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
