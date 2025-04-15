package com.oop.oop13_Pritace;

/**
 * @Description Car
 * @Author ChengYun
 * @Date 2025-03-20  21:32
 */
public class Car_02 {
    private String name;
    private double price;

    public Car_02(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
