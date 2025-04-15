package com.chengyun;


import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @Description UserServiceTest
 * @Author ChengYun
 * @Date 2025-04-09  17:44
 */
@DisplayName("用户服务测试类")
public class UserService1Test {

    @AfterAll
    @DisplayName("所有测试完成后执行")
    public static void tearDown() {
        System.out.println("所有测试已完成！");
    }

    @DisplayName("测试获取性别1")
    @Test
    public void testGetGender(){
        UserService userService = new UserService();
        String gender = userService.getGender("110100112343231234");
        System.out.println("测试获取性别1");
    }

    //参数化测试

    @DisplayName("测试获取性别2")
    @ParameterizedTest
    @ValueSource(strings = {"110100112343231234","110100112343231234"})
    public void testGetGender2(String idCard){
        UserService userService = new UserService();
        Assertions.assertEquals("男",userService.getGender(idCard),"性别计算错误");
        System.out.println("测试获取性别2");
    }

    @BeforeAll
    @DisplayName("所有测试开始前执行")
    public static void setUp() {
        System.out.println("所有测试开始！");
    }

    @BeforeEach
    @DisplayName("测试开始前执行")
    public void setUpEach() {
        System.out.println("测试开始！");
    }

    @AfterEach
    @DisplayName("测试结束后执行")
    public void tearDownEach() {
        System.out.println("测试结束！");
    }


}
