package com.Work.Day02;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Description Demo_06
 * @Author ChengYun
 * @Date 2025-03-29  15:22
 */
/*如图所示:我们在逛淘宝的时候,会把喜欢的商品加入到购物车中,当我们第一次加入到购物车的时候,
购物车中该商品的数量会显示为1,如果我们添加的是同一个店铺的同一件商品,购物车中该商品的数量会增加1。
但是如果添加的不是同一个店铺的商品不用,我们则认为不是同一件商品,添加到购物车的时候就会当做新商品添加。
请设计程序,完成将商品添加到购物车的需求.*/
public class Demo_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Product_06, Integer> map = new HashMap<>();

        while (true) {
            System.out.println("请输入店铺名称：");
            String store = scanner.next();
            System.out.println("请输入商品名称：");
            String name = scanner.next();
            Product_06 product = new Product_06(store, name);
            if(map.containsKey(product)){
                map.put(product,map.get(product)+1);
                show(map);
            }else{
                map.put(product,1);
                show(map);
            }
        }
    }

    private static void show(HashMap<Product_06, Integer> map) {
        for (Product_06 product : map.keySet()) {
            System.out.println(product.getStore()+"--"+product.getName()+"--"+map.get(product));
        }

    }
}
