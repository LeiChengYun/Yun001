package com.Work.Day01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description ProductItem_04
 * @Author ChengYun
 * @Date 2025-03-30  21:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductItem_04 {
    //订单项id
    private int productItemId;
    //订单项编号
    private int productItemNumber;
    //商品编号
    private int productNumber;
    //商品名称
    private String productName;
    //商品价格
    private double price;
}
