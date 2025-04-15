package com.oop.oop21_内部类;

/**
 * @Description Body
 * @Author ChengYun
 * @Date 2025-03-22  9:24
 */
public class Body01 {
    public boolean isLive = true;
    public double weight = 80.0;

    class Heart{
        public double weight = 5.0;

        public void jump(){
            double weight = 1.0;
            System.out.println("局部变量的重量："+weight);//就近原则，1
            System.out.println("内部类变量的重量："+this.weight);//5
            System.out.println("外部类变量的重量："+ Body01.this.weight);//80

            if (isLive){
                System.out.println("心脏跳动正常");
            }else{
                System.out.println("心脏跳动不正常");
            }

        }
    }
}
