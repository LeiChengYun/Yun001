package com.leilei;

/**
 * @Description Pra_02
 * @Author ChengYun
 * @Date 2025-03-22  17:21
 */

//this作为构造参数在构造方法中传递。。
public class Pra_02 {
    int count = 10;

    Pra_02() {
        Data data = new Data(this);
        data.show();
    }

            public static void main(String[] args) {
                new Pra_02();
            }




    static class Data {
        Pra_02 param;

        Data(Pra_02 p){
            this.param = p;
        }

        public void show(){
            System.out.println(param.count);
        }

     }


}
