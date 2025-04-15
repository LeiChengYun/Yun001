package com.oop.oop24_员工管理系统;

/**
 * @Description Consumer
 * @Author ChengYun
 * @Date 2025-03-23  20:22
 */
public class Consumer {
    private String userName;
    private String userPassword;

    public Consumer(String userName, String userPassword) {
        this.userName = userName;
        this.userPassword = userPassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    @Override
    public String toString() {
        return "Consumer{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                '}';
    }
}
