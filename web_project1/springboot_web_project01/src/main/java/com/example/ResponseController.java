package com.example;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description ResponseController
 * @Author ChengYun
 * @Date 2025-04-12  20:21
 */
@RestController
public class ResponseController {


    //响应方式一：
    @RequestMapping("/response")
    public void response(HttpServletResponse response) {

        //1.设置响应状态码
        response.setStatus(200);

        //2.设置响应头
        response.addHeader("name", "ChengYun");
        response.addHeader("age", "18");
        response.addIntHeader("age", 18);
        response.addDateHeader("date", new Date().getTime());

        //3.设置响应体
        response.setContentType("text/html;charset=utf-8");
        try {
            response.getWriter().println("<h1>Hello, Response</h1>");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //响应方式二：
    @RequestMapping("/response2")
    public ResponseEntity response2(){
        return ResponseEntity.status(401)
                .header("name","ChengYun")
                .body("<h1>Hello response2<h1>");
    }


}
