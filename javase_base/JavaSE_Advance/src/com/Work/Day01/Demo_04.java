package com.Work.Day01;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @Description Demo_04
 * @Author ChengYun
 * @Date 2025-03-29  17:06
 */
public class Demo_04 {
    public static void main(String[] args) {
        ArrayList<ProductItem_04> productItemList = new ArrayList<>();
        productItemList.add(new ProductItem_04(1, 1, 1, "手机", 1500));
        productItemList.add(new ProductItem_04(2, 2, 2, "袜子", 23));
        productItemList.add(new ProductItem_04(3, 3, 3, "笔记本", 5000));
        productItemList.add(new ProductItem_04(4, 4, 4, "洗脸盆", 6));

        ArrayList<ArrayList<ProductItem_04>> list = new ArrayList<>();

        list.add(productItemList);

        Iterator<ArrayList<ProductItem_04>> iterator = list.iterator();

        while (iterator.hasNext()) {
            ArrayList<ProductItem_04> productItemList1 = iterator.next();
            for (ProductItem_04 p : productItemList1){
                System.out.println(p.getProductItemId()+" "+p.getProductItemNumber()+" "+p.getProductNumber()+" "+p.getProductName()+" "+p.getPrice());
            }
        }

    }

}
