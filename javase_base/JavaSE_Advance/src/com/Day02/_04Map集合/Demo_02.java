package com.Day02._04Map集合;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description Demo_02
 * @Author ChengYun
 * @Date 2025-03-28  21:46
 */
//map常用api
public class Demo_02 {
    public static void main(String[] args) {
        // map集合的大小 size()
        // 判断集合是否为空 isEmpty()
        // 清空集合
        // 判断集合中是否存在某个键 containsKey(key)
        // 判断集合中是否包含某个值 containsValue(value)
        // 获取某个键对应的值 get(key)
        // 获取所有的键 : public Set<K> keySet()
        // 获取所有的值 : public Collection<V> values()


        //目标：操作hashMap的常用方法
        Map<String,String> map1 = new HashMap<>();
        map1.put("004","张三");
        map1.put("004","李四");//覆盖了张三，key=001,value=李四
        map1.put("002","abc");
        map1.put("008","dd");
        map1.put("abc","dd");
        map1.put("009","dd");
        map1.put(null,null);//key也可以为null
        System.out.println(map1);

        // map集合的大小 size()
        System.out.println(map1.size());//6

        // 判断集合是否为空 isEmpty()
        System.out.println(map1.isEmpty());//false
        // 清空集合
        //map1.clear();

        // 判断集合中是否存在某个键 containsKey(key)
        System.out.println(map1.containsKey("009"));//true
        System.out.println(map1.containsKey("0091"));//false

        // 判断集合中是否包含某个值 containsValue(value)
        System.out.println(map1.containsValue("李四"));//true

        // 获取某个键对应的值 get(key)
        System.out.println(map1.get("004"));//李四
        // 获取所有的键 : public Set<K> keySet()
        Set<String> keys = map1.keySet();
        System.out.println(keys);
        // 获取所有的值 : public Collection<V> values()
        Collection<String> values = map1.values();
        System.out.println(values);

    }
}
