package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
public class HelloWorldController {

    @RequestMapping("/sso")
    public String index(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {

        HttpSession session = httpServletRequest.getSession();
        String data = session.getId();
//        OutputStream outputStream = httpServletResponse.getOutputStream();
//        httpServletResponse.setHeader("content-type", "text/html;charset=UTF-8");
//        byte[] dataByteArr = data.getBytes("UTF-8");
////        outputStream.write(dataByteArr);
//        httpServletRequest.getRequestURL();
        HttpSession httpSession =httpServletRequest.getSession();

        System.out.println(httpSession.getId());
        return "sso";
    }

    @RequestMapping("/test")
    public String test() throws IOException {
        System.out.println("/test");
//        SupervisorService supervisorService =new SupervisorService();

        return "/test";
    }
}
