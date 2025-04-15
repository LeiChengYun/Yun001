package com.leilei;

/**
 * @Description Pra_09
 * @Author ChengYun
 * @Date 2025-04-07  10:28
 */
//throw 主动抛出异常
public class Pra_09 {
    public static void main(String args[]){
        checkEligibilty(10);
        System.out.println("愉快地周末..");
    }

    public static void checkEligibilty(int stuage) {
        if (stuage < 18) {
            throw new ArithmeticException("年纪未满 18 岁，禁止观影");
        } else {
            System.out.println("请认真观影!!");
        }
    }
}