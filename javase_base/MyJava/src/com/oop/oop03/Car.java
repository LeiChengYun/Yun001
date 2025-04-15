package com.oop.oop03;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Car
 * @Author ChengYun
 * @Date 2025-03-18  10:51
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    private String no;
    private String color;

//    public String getNo() {
//        return no;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public Car(String no,String color){
//        this.no = no;
//        this.color = color;
//    }

   public void info() {
        System.out.println("车牌" + no + "的颜色是" + color);
    }

}
