package org.example.controller;


import org.apache.commons.io.IOUtils;
import org.example.pojo.Result;
import org.example.pojo.User;
import org.example.server.Imp.UserSeverImp;
import org.example.server.UserServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
public class HelloController {

    UserServer userServer = new UserSeverImp();
    @RequestMapping(value="/depts", method= RequestMethod.GET)
    //1.在controller的方法上，声明 `@RequestMapping` 注解的method属性，通过method属性指定请求方式。 如下：
    //2.直接使用 `@GetMapping` 来替换 @RequestMapping 注解，@GetMapping其实就是对@RequestMapping的封装，并限定了请求方式为GET。
    public Result list(){
        List<User> userList = userServer.userList();


        //System.out.println(userList);


        return Result.success(userList);
        //return Result.success("error");

    }
}
