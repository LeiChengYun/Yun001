package com.oop.oop13_Pritace;

/**
 * @Description Computer_04
 * @Author ChengYun
 * @Date 2025-03-21  19:47
 */
public class Computer_04 extends Digital_04{
    private String cpu;

    public Computer_04() {
    }

    public Computer_04(String brand, double price, String cpu) {
        super(brand, price);
        this.cpu = cpu;
    }

    @Override
    public void takePhoto() {
        System.out.println("简单拍照");
    }

    public void coding(){
        System.out.println("使用价格是"+super.getPrice()+"元的"+cpu+"的"+super.getBrand()+"进行编程");
    }


}
