package com.kaoshi;

/**
 * @Description Test01
 * @Author ChengYun
 * @Date 2025-03-24  9:45
 */
public class Test02 {
    public static void main(String[] args) {
        Phone phone1 = new Phone("诺基亚",100.0);
        phone1.call();
        phone1.sendMessage();


        SmartPhone phone2 = new SmartPhone("华为",3000.0);
        phone2.call();
        phone2.sendMessage();
        phone2.playGame();

    }
}
