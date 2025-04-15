package com.Day02.斗地主小案例;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.shuffle;

/**
 * @Description Room
 * @Author ChengYun
 * @Date 2025-03-30  17:16
 */
public class Room {
    private static List<Card> cards = new ArrayList<>();

    {
       String[] colors = {"♥","♠","♣","♦"};
       String[] numbers = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
       int index = 0;

        for (int i = 0; i < numbers.length; i++) {
            index++;
            for (int j = 0; j < colors.length; j++) {
                cards.add(new Card(numbers[i],colors[j],index));
            }
        }

        cards.add(new Card("\uD83C\uDCCF","",++index));
        cards.add(new Card("\uD83D\uDC72","",++index));

        //System.out.println(cards);




    }


    public static void main(String[] args) {
        Room room = new Room();
        room.start();
    }


    public static void start(){
        //做牌
        System.out.println("开始做牌");
        System.out.println(cards);
        //洗牌
        System.out.println("洗牌");
        shuffle(cards);
        System.out.println(cards);

        //发牌
        System.out.println("发牌");
        List<Card> player1 = new ArrayList<>();
        List<Card> player2 = new ArrayList<>();
        List<Card> player3 = new ArrayList<>();

        //3.3.1 遍历所有牌，逐个发牌，一共发51张
        //分析：所有牌 3♥,    3♠,    3♣,      3♦,    4♥,    4♠, 4♣, 4♦, 5♥, 5♠, 5♣ ...
        //            0(张)  1(李)   2(王)   3(张)   4  5  6  7  8  9  10 11 12 ...
        //结果：下标对3取余数，余数0给张三，余数1给李四，余数2给王五

        for(int i = 0; i < cards.size()-3; i++){
            if(i % 3 == 0){
                player1.add(cards.get(i));
            }if (i % 3 == 1){
                player2.add(cards.get(i));
            }if(i % 3 == 2){
                player3.add(cards.get(i));
            }
        }

        //3.3.2 底盘
        //定义存储底盘的集合
        //方式1：集合对象.subList(开始索引,结束索引)可以根据索引下标范围截取元素得到新集合
        List<Card> dipan = cards.subList(cards.size()-3,cards.size());
        //方式2：
        //List<Card> dipan2 = allCardList.stream().skip(allCardList.size()-3).collect(Collectors.toList());
        System.out.println("底牌："+dipan);





        //排序
        cardSort(player1);
        cardSort(player2);
        cardSort(player3);

        player2.addAll(dipan);

        System.out.println("张三的牌：" + player1);
        System.out.println("李四的牌：" + player2);
        System.out.println("王五的牌：" + player3);


    }

    private static void cardSort(List<Card> cards) {
        Collections.sort(cards,(o1, o2) -> o1.getIndex()-o2.getIndex());
    }


}
