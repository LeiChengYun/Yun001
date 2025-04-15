package com.数组;

import java.util.Random;

/**
 * @Description array01
 * @Author ChengYun
 * @Date 2025-03-16  9:05
 */

//洗牌数组，斗地主
public class array01 {
    public static void main(String[] args) {
        // 做牌
        String[] pokerCards = createPokerCards();
        System.out.println("初始牌组: ");
        printPokerCards(pokerCards);

        // 洗牌
        shufflePokerCards(pokerCards);
        System.out.println("洗牌后的牌组: ");
        printPokerCards(pokerCards);
    }

    /**
     * 创建一副54张的扑克牌
     * @return 包含54张牌的数组
     */
    public static String[] createPokerCards() {
        String[] pokerCards = new String[54];
        String[] suits = {"红桃", "黑桃", "梅花", "方块"};
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int index = 0;
        // 添加52张标准扑克牌
        for (String suit : suits) {
            for (String rank : ranks) {
                pokerCards[index++] = suit + rank;
            }
        }

        // 添加大王和小王
        pokerCards[index++] = "大王";
        pokerCards[index++] = "小王";

        return pokerCards;
    }

    /**
     * 洗牌
     * @param pokerCards 包含54张牌的数组
     */
    public static void shufflePokerCards(String[] pokerCards) {
        Random random = new Random();
        for (int i = pokerCards.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            // 交换 pokerCards[i] 和 pokerCards[j]
            String temp = pokerCards[i];
            pokerCards[i] = pokerCards[j];
            pokerCards[j] = temp;
        }
    }

    /**
     * 打印牌组
     * @param pokerCards 包含54张牌的数组
     */
    public static void printPokerCards(String[] pokerCards) {
        for (String card : pokerCards) {
            System.out.print(card + " ");
        }
        System.out.println();
    }
}

