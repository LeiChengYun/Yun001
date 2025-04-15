package com.Work.Day02;

import java.util.ArrayList;

/**
 * @Description TDemo_05
 * @Author ChengYun
 * @Date 2025-03-29  16:35
 */
//题目描述：设计一个银行账户管理系统，使用 ArrayList 存储多个银行账户信息。
// 每个账户包含账户 ID、账户持有人姓名和账户余额。
// 系统需要支持以下操作：开户、存款、取款、查询余额，并且在取款时要处理余额不足的异常。
public class TDemo_05 {
    public static ArrayList<Card_05> list = new ArrayList<>();

    public static void main(String[] args) {

        userSet("123456219", "张三", 3000.0);
        userSet("123456323", "张三", 100000.0);
        fund("123456219", 5000.0);
        fund("123456323", 10000.0);
        fund("133456323", 5000.0);



    }

    //开户
    public static void userSet(String id, String name, double banlance) {
        Boolean flag = false;
        for (Card_05 card : list){
            if (card.getId().equals(id)){
                System.out.println("该用户已存在!");
                flag = true;
                return;
            }
        }
        if(!flag){
            list.add(new Card_05(id, name, banlance));
            System.out.println("开户成功！");

            show();
        }
    }

    //存款
    public static void fund(String id, double money) {
        Boolean flag = false;
        for (Card_05 card : list){
            if(card.getId().equals(id)){
                card.setBanlance(card.getBanlance()+money);
                System.out.println("ID号为:"+id+"用户存款成功:"+money+"元");
                flag = true;
                show();
            }
        }
        if(!flag){
            System.out.println("存款失败，该用户不存在,请重新输入!");
        }

    }

    public static void show() {
        System.out.println("所有账户信息如下：");
        for (Card_05 card : list) {
            System.out.println("卡号为:"+card.getId() + "   姓名为:" + card.getName() + "   余额为:" + card.getBanlance());
        }
        System.out.println("---------------------------------------------");
    }

}
