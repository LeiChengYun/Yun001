package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {
        // 通过maven项目通过手动搭建Springbok依赖，搭建springboot项目
        // 1. 创建maven
        // 2. 添加springboot依赖
        // 3. 创建启动类
        // 4. 运行项目

        public static void main(String[] args) {
            SpringApplication.run(SpringBootDemoApplication.class, args);
        }

}
