package com.Work.Day02;

import java.util.Objects;

/**
 * @Description User_03
 * @Author ChengYun
 * @Date 2025-03-29  10:50
 */
public class User_03 {
    private String username;
    private String password;

    public User_03() {
    }

    public User_03(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User_03 user03 = (User_03) o;
        return Objects.equals(username, user03.username) && Objects.equals(password, user03.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, password);
    }
}
