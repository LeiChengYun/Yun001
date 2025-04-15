package com.oop.oop13_Pritace;

/**
 * @Description Phone_04
 * @Author ChengYun
 * @Date 2025-03-21  19:41
 */
public class Phone_04 extends Digital_04{
    private String mode;

    public Phone_04() {
    }

    public Phone_04(String brand, double price, String mode) {
        super(brand, price);
        this.mode = mode;
    }

    public void call(){
        System.out.println("使用了价格是"+super.getPrice()+"元的"+mode+"的"+super.getBrand()+"手机打电话");
    }

    @Override
    public void takePhoto() {
        System.out.println("打开了美颜进行拍照");
    }
}
