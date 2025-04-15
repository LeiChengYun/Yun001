package com.oop.oop16_抽象_模版设计;

/**
 * @Description Singer
 * @Author ChengYun
 * @Date 2025-03-21  11:43
 */
public abstract class Singer {
    //1.定义模板方法：里面放重用的代码的所有步骤,不让子类重写，因为模板方法规定了实现流畅
    // 模板方法是给子类直接使用的，不能让子类重写
    public final void sing() {
        System.out.println("Singer sing");
        dance();
    }

    public abstract void dance();

}
