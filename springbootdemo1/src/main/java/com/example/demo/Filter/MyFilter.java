package com.example.demo.Filter;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

@Component
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init!");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
       // servletResponse.getWriter().print("filter before:");
        filterChain.doFilter(servletRequest,servletResponse);
       // servletResponse.getWriter().print("filter after:");
    }

    @Override
    public void destroy() {
        System.out.println("destroy!");
    }
}
