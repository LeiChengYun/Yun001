package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description HelloController
 * @Author ChengYun
 * @Date 2025-04-12  14:49
 */
@RestController //标识当前是一个请求处理类
public class HelloController {
    @RequestMapping("/hello")
   public String hello(String name){
       System.out.println("------HelloController.hello------");
       return "Hello World!"+name;
   }
}
