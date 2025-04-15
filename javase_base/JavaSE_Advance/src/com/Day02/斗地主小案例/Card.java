package com.Day02.斗地主小案例;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Card
 * @Author ChengYun
 * @Date 2025-03-30  17:12
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String number;
    private String color;
    private int index;

    @Override
    public String toString() {
        return number+color;
    }
}
