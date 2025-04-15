package com.oop.oop13_Pritace;

/**
 * @Description Digital
 * @Author ChengYun
 * @Date 2025-03-21  19:38
 */
public class Digital_04 {
    private String brand;
    private double price;

    public Digital_04(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Digital_04() {
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

    public void takePhoto(){
        System.out.println("拍照");
    }

}
