package com.xue.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Mr.xue
 * @Description:
 * @Date:created by: 16:27 2017/8/15
 */
public class SpringMvcInterceptor implements HandlerInterceptor {

    //调用请求前的一些操作
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        return true;//当值为false是就拦截，不向controller发送请求
    }
    //发送请求
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {
        System.out.println("请求执行了");
    }

    //调用请求后的一些操作
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {
        System.out.println("请求执行完了");
    }
}
