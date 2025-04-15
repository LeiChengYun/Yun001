//package com.itheima.demo1junit;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//// 测试类。
//public class StringUtilTest {
//
//    // 测试方法
//    // 1、必须公开，无参数，无返回值。
//    // 2、必须加上@Test注解。
//    @Test
//    public void testPrintNumber() {
//        // 编写测试用例。
//        StringUtil.printNumber(null);
//        StringUtil.printNumber("abc");
//        StringUtil.printNumber("");
//    }
//
//    @Test
//    public void testGetMaxIndex(){
//        int maxIndex = StringUtil.getMaxIndex("abc");
//        System.out.println(maxIndex);
//
//        // 断言：预测返回的结果是否正确。
//        Assert.assertEquals("本轮测试失败，业务出现bug", 2, maxIndex );
//
//        int maxIndex2 = StringUtil.getMaxIndex("");
//        System.out.println(maxIndex2);
//
//        int maxIndex3 = StringUtil.getMaxIndex(null);
//        System.out.println(maxIndex3);
//    }
//}
