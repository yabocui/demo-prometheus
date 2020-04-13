//package com.example.demo.filter;
//
//import javax.servlet.*;
//import java.io.IOException;
//
//public class SecondFilter implements Filter {
//    @Override
//    public void init(FilterConfig filterConfig) throws ServletException {
//        System.out.println("*****************initial SecondFilter*************");
//    }
//
//    @Override
//    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//        System.out.println("*****************begin doFilter secondFilter*************");
//        filterChain.doFilter(servletRequest,servletResponse);
//        System.out.println("*****************end doFilter secondFilter*************");
//    }
//
//    @Override
//    public void destroy() {
//        System.out.println("*****************destroy secondFilter*************");
//    }
//}
