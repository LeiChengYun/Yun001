package org.example.server.Imp;

import org.example.dao.Imp.UserDaoImp;
import org.example.dao.UserDao;
import org.example.pojo.User;
import org.example.server.UserServer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class UserSeverImp implements UserServer {
    UserDao userDao = new UserDaoImp();
    @Override
    public List<User> userList() {
        //调用Dao中函数,获取数据：
        List<String> lines = userDao.list();

        List<User> userList = lines.stream().map(line -> {
            String[] split = line.split(",");
            Integer id = Integer.parseInt(split[0]);
            String name = split[1];
            LocalDateTime updateTime = LocalDateTime.parse(split[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            User user = new User(id, name, updateTime);
            return user;
        }).toList();

        return userList;
    }
}
