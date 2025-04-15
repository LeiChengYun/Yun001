package com.oop.oop13_Pritace;

/**
 * @Description Camera_04
 * @Author ChengYun
 * @Date 2025-03-21  19:54
 */
public class Camera_04 extends Digital_04{
    private String type;

    public Camera_04(String brand, double price, String type) {
        super(brand, price);
        this.type = type;
    }

    public Camera_04() {
    }

    @Override
    public void takePhoto() {
        System.out.println("使用人像模式去拍照");
    }

    public void video(){
        System.out.println("使用了价格是"+super.getPrice()+"的"+super.getBrand()+type+"相机录像");
    }

}
