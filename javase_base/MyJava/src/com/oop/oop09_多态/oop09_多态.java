package com.oop.oop09_多态;

/**
 * @Description oop09_多态
 * @Author ChengYun
 * @Date 2025-03-19  20:52
 */
public class oop09_多态 {


    /*这段代码的功能是通过多态机制调用不同对象的write方法，输出不同的结果。具体逻辑如下：
    定义一个父类引用数组Wanger[]，包含父类Wanger和子类Wangxiaoer的对象。
    使用增强型for循环遍历数组，调用每个对象的write方法。
    根据实际对象类型，输出不同内容：父类Wanger输出“勿忘国耻”，子类Wangxiaoer输出“记住仇恨，表明我们要奋发图强的心智”。*/
    public static void main(String[] args) {
        // 父类引用指向子类对象
        WangEr[] wangErs = { new WangEr(), new WangXiaoEr() };

        for (WangEr wanger : wangErs) {
            // 对象是王二的时候输出：勿忘国耻
            // 对象是王小二的时候输出：记住仇恨，表明我们要奋发图强的心智
            wanger.write();
        }
    }
}


class WangEr {
    public void write() {
        System.out.println("勿忘国耻");
    }

    public void read() {
        System.out.println("每周读一本好书");
    }
}


//子类继承父类
class WangXiaoEr extends WangEr {
    @Override
    public void write() { // 子类重写父类方法
        System.out.println("记住仇恨，表明我们要奋发图强的心智");
    }

    public void eat() {
        System.out.println("我不喜欢读书，我就喜欢吃");
    }
}