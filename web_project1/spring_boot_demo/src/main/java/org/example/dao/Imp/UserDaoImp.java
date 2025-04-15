package org.example.dao.Imp;

import org.apache.commons.io.IOUtils;
import org.example.dao.UserDao;

import java.io.InputStream;
import java.util.List;

public class UserDaoImp implements UserDao {

    @Override
    public List<String> list() {

        InputStream in = this.getClass().getClassLoader().getResourceAsStream("dept.txt");
        List<String> lines = IOUtils.readLines(in, "UTF-8");
        return lines;
    }
}
