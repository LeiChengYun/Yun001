package com.example.controller;

import cn.hutool.core.io.IoUtil;
import com.example.pojo.User;
import com.example.server.Imp.UserServerImp;
import com.example.server.UserServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description userController
 * @Author ChengYun
 * @Date 2025-04-12  22:04
 */
@RestController
//标识当前是一个请求处理类  @ResController等价于@Controller  + @ResponseBody  如果返回的是一个对象或集合自动转json----》响应数据
public class userController {

    @Autowired
    private UserServer userServer;

    @RequestMapping("/list")
    public List<User> list() {

        //调用函数，直接返回数据
        return userServer.userList();



        /*//读取数据，使用hutool工具类
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readUtf8Lines(in,new ArrayList<>());

        //打印集合
        System.out.println(lines);

        //遍历集合
        for (String line : lines) {
            System.out.println(line);
        }

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

        //打印集合
        System.out.println(userList);

        //响应数据
        //return JSONUtil.toJsonStr(userList, JSONConfig.create().setDateFormat("yyyy-MM-dd HH:mm:ss"));

        //可以直接返回集合，自动转换为json格式
        return userList;*/

    }
}
