package com.数组;

import java.util.Arrays;

/**
 * @Description array04
 * @Author ChengYun
 * @Date 2025-03-16  11:16
 */
public class array04 {
    public static void main(String[] args) {
        String poker[] = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String pokerColor[] = new String[]{"黑桃", "红桃", "梅花", "方块"};
        String pokerCards[] = new String[54];

        // 创建扑克牌
        int index = 0;
        for(int i = 0;i < poker.length ; i++){
            for(int j = 0;j < pokerColor.length;j++){
                pokerCards[index++] = pokerColor[j] + poker[i];
            }
        }
        pokerCards[index++] = "大王";
        pokerCards[index++] = "小王";
        System.out.println(Arrays.toString(pokerCards));


        //打乱顺序洗牌
        for (int i = 0; i < poker.length; i++) {
            int index1 = (int) (Math.random() * pokerCards.length);
            String temp = pokerCards[i];
            pokerCards[i] = pokerCards[index1];
            pokerCards[index1] = temp;
        }
        System.out.println("\n"+Arrays.toString(pokerCards));


    }

}
