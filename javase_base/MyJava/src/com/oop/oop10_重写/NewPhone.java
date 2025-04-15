package com.oop.oop10_重写;

/**
 * @Description NewPhone
 * @Author ChengYun
 * @Date 2025-03-20  10:42
 */
public class NewPhone extends OldPhone {
    @Override
    public void sendMessage()
    {
        System.out.println("发短信图片音频");
    }


}
