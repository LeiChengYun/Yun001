package com.example.server.Imp;

import com.example.dao.Imp.UserDaoImp;
import com.example.dao.UserDao;
import com.example.pojo.User;
import com.example.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * @Description UserServerImp
 * @Author ChengYun
 * @Date 2025-04-13  11:25
 */
@Component   //标识当前是一个组件类, 自动注入到spring容器中
public class UserServerImp implements UserServer {

    @Autowired     // 自动装配：应用程序在运行时，会自动从容器中找到该类型的对象，并注入到当前变量中。
    private UserDao userDao;

    @Override
    public List<User> userList() {
        //调用Dao中函数,获取数据：
        List<String> lines = userDao.list();

        List<User> userList = lines.stream().map(line ->{
            String[] split = line.split(",");
            return new User(
                    Integer.parseInt(split[0]),
                    split[1],
                    split[2],
                    split[3],
                    Integer.parseInt(split[4]),
                    LocalDateTime.parse(split[5], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        }).toList();

        return userList;
    }
}
