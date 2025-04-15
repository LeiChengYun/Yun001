package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description RequestController
 * @Author ChengYun
 * @Date 2025-04-12  19:52
 */
@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        //获取请求方式
        String method = request.getMethod();
        System.out.println(method);

        //获取请求参数
        String queryString = request.getQueryString();
        System.out.println(queryString);

        //获取请求URl
        String requestURL = request.getRequestURL().toString();
        System.out.println(requestURL);

        //获取请求URI
        String requestURI = request.getRequestURI();
        System.out.println(requestURI);

        //获取请求协议
        String protocol = request.getProtocol();
        System.out.println(protocol);

        //获取请求头
        String header = request.getHeader("User-Agent");
        System.out.println(header);



        return "Hello ";
    }
}
