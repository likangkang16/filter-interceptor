package com.lkk.demo.fliters;


import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @ClassName FilterImpl
 * @Description //TODO
 * @Author lkk
 * Date 2023/10/30/16:49
 * @Version 1.0
 **/
@Component
public class FilterImpl implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest) servletRequest;
        String uri = request.getRequestURI();
        System.out.println("doFilter-请求的URI为:"+uri);
        filterChain.doFilter(request,servletResponse);
    }
}
