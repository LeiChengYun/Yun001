package com.oop.oop10_重写;

/**
 * @Description OldPhone
 * @Author ChengYun
 * @Date 2025-03-20  10:39
 */
public class OldPhone {
   private String message;

   public void setMessage(String message)
   {
       this.message = message;
   }

   public String getMessage()
   {
       return message;
   }

    public void call()
    {
        System.out.println("打电话");
    }

    public void sendMessage()
    {
        System.out.println("发短信");
    }

    public void takePhoto()
    {
        System.out.println("拍照");
    }

    public void playGame()
    {
        System.out.println("打游戏");
    }

    public void show()
    {
        System.out.println("我是老手机");
    }
}
