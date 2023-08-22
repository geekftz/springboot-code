package com.example.web;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    /**
     *
     * @param request
     * @param response
     * @param handler 被拦截的控制器对象
     * @return boolean
     *      true: 请求能被controller处理
     *      false: 请求被截断
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("prehandle log log");
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }
}
