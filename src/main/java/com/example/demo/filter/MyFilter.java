//package com.example.demo.filter;
//
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import java.io.IOException;
//
////@Component
////@WebFilter(urlPatterns = "/hello/*",filterName = "myFilter")
//public class MyFilter implements Filter {
//
//    @Override
//public void init(FilterConfig filterConfig) throws ServletException {
//    System.out.println("*****************initial*************");
//}
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("*****************begin doFilter*************");
//        filterChain.doFilter(servletRequest,servletResponse);
//        if (3>2){
//            return;
//        }
//        System.out.println("*****************end doFilter*************");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("*****************destroy*************");
//    }
//}
