package com.lkk.demo.interceptor;


import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @ClassName InterceptorImpl
 * @Description //TODO
 * @Author lkk
 * Date 2023/10/30/16:55
 * @Version 1.0
 **/
@Component
public class InterceptorImpl implements HandlerInterceptor {

    private Integer count = 1;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uri = request.getRequestURI();
        System.out.println("preHandle-请求在进入controller之前的uri为:" + uri);
        if (count % 2 == 0) {
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle-请求已经从controller返回");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
                                Exception ex) throws Exception {

        String uri = request.getRequestURI();
        System.out.println("afterCompletion-请求在进入controller之前的uri为:" + uri);
    }
}
