package com.oop.oop01;

/**
 * @Description student
 * @Author ChengYun
 * @Date 2025-03-17  11:26
 */
public class student {
  private String name;
  private int chinese;
  private int math;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }



    //this  当前对象(哪个对象调用这个方法，this就是哪个对象)，打印就打印对象内存地址
    public void printThis(){
        System.out.println(this);
    }



    //this的使用，区分对象的成员变量和局部变量
    public void check(double score){
        if(this.math >= score){
            System.out.println("恭喜您，考上哈佛");
        }else{
            System.out.println("不好意思，没有考上~");
        }
    }


    public student(){
        System.out.println("student无参构造方法");
    }

    public student (String name,int chinese,int math){
        this.setName(name);
        this.setMath(math);
        this.setChinese(chinese);
    }


}
