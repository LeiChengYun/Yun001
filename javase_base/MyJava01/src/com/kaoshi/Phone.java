package com.kaoshi;

import jdk.jfr.DataAmount;

/**
 * @Description Phone
 * @Author ChengYun
 * @Date 2025-03-24  9:49
 */

public class Phone {
    private String brand;

    private double price;

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void call(){
        System.out.println("在使用"+this.price+"元"+this.brand+"手机打电话");
    }

    public void sendMessage(){
        System.out.println("在使用"+this.price+"元"+this.brand+"手机发短信");
    }
}
