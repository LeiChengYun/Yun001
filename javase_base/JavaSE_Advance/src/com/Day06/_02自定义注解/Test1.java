package com.Day06._02自定义注解;

public @interface Test1 {
    String aa();
    String bb();

    String[] cc() default {"aaa","bbb"};

    String vaule() default "hello";
}
