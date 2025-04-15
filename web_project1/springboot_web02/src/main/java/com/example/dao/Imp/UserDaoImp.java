package com.example.dao.Imp;

import cn.hutool.core.io.IoUtil;
import com.example.dao.UserDao;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description UserDaoImp
 * @Author ChengYun
 * @Date 2025-04-13  11:24
 */
@Component      // 标识当前是一个组件类, 自动注入到spring容器中
public class UserDaoImp implements UserDao {
    @Override
    public List<String> list() {
        //读取数据，使用hutool工具类
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("user.txt");
        ArrayList<String> lines = IoUtil.readUtf8Lines(in,new ArrayList<>());
        return lines;
    }
}
