package com.oop.oop20_枚举小案例;



/**
 * @Description Car
 * @Author ChengYun
 * @Date 2025-03-21  19:13
 */
public class Car {
    private String brand;

    public void run(String brand, Orientation orientation){
       switch (orientation){
           case NORTH :
               System.out.println(brand+"北向行驶");
               break;
           case SOUTH :
               System.out.println(brand+"南向行驶");
               break;
           case EAST :
               System.out.println(brand+"东向行驶");
               break;
           case WEST :
               System.out.println(brand+"西向行驶");
               break;
       }
    }
}
