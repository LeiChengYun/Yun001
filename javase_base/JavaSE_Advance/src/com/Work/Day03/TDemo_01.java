package com.Work.Day03;


import java.util.*;
import java.util.stream.Collectors;

/**
 * @Description TDemo_01
 * @Author ChengYun
 * @Date 2025-03-30  21:36
 */
//某个班级组织团建活动，班长给出了几个去处给大家选择，分别是“农家乐”，"轰趴"，“野外拓展
//“健身房”，本次活动每个学生是可以多选的。现在有如下5名学生选择了如下去处。
public class TDemo_01 {
    public static void main(String[] args) {
        String[] adressList = {"农家乐","轰趴","野外拓展","健身房"};


        //定义学生集合
        List<TStudent_01> students = Arrays.asList(
                new TStudent_01("张全蛋", Arrays.asList(adressList[0],adressList[2])),
                new TStudent_01("李二狗子", Arrays.asList(adressList[1],adressList[2],adressList[3])),
                new TStudent_01("翠花", Arrays.asList(adressList[2])),
                new TStudent_01("小帅", Arrays.asList(adressList[1],adressList[3])),
                new TStudent_01("有容", Arrays.asList(adressList[0]))

        );


        System.out.println(students);


        //1.统计每个去处有多少人去
        Map<String,Integer> map = new TreeMap<>();
        for(String address : adressList){
                int count = 0;
                for(TStudent_01 student : students){
                    if(student.getAddressList().contains(address)){
                        count++;
                    }
                }
                map.put(address,count);

        }
        System.out.println("打印每个地址投票数：");
        System.out.println(map);


        //找出去哪个景点的人最多

        //方式一：ai写法
        Optional<Map.Entry<String, Integer>> max = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));
        System.out.println("投票数最多的景点是："+max.get().getKey()+"，投票数有"+max.get().getValue()+"人");

        //方式二：
        Map.Entry<String, Integer> max1 = Collections.max(map.entrySet(), new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue()-o2.getValue();
            }
        });
        System.out.println("投票数最多的景点是："+max1.getKey()+"，投票数有"+max1.getValue()+"人");

        //方式三：
        Map.Entry<String, Integer> max2 = Collections.max(map.entrySet(), (o1, o2) -> o1.getValue()-o2.getValue());
        System.out.println("投票数最多的景点是："+max2.getKey()+"，投票数有"+max2.getValue()+"人");

        //方式四：
        Map.Entry<String, Integer> max3 = Collections.max(map.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        System.out.println("投票数最多的景点是："+max3.getKey()+"，投票数有"+max3.getValue()+"人");

        //方式五：
        Map.Entry<String, Integer> max4 = map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("投票数最多的景点是："+max4.getKey()+"，投票数有"+max4.getValue()+"人");

        //方式六：
        Map.Entry<String, Integer> max5 = map.entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);
        System.out.println("投票数最多的景点是："+max5.getKey()+"，投票数有"+max5.getValue()+"人");

        //方式七：课堂方式
        Optional<Map.Entry<String, Integer>> max6 = map.entrySet().stream().max((o1, o2) ->{
            return o1.getValue()-o2.getValue();
        });

        //isPresent() 是 Optional 类的一个方法，用于检查其中是否包含值。具体来说：
        //如果 Optional 中存在值，则返回 true。
        //如果 Optional 为空（即没有值），则返回 false。

        //max6.isPresent() 的作用是检查 Optional<Map.Entry<String, Integer>> 是否包含值。
        //在实际使用中，建议结合 isPresent() 和 get() 方法来安全地获取值，或者直接使用 orElse()、ifPresent() 等方法处理 Optional 的值。

        //if(o==null){
        //    System.out.println("没有投票最多的去处");
        //    return ;
        //}

        if(max6.isPresent()){
            System.out.println("投票数最多的景点是："+max6.get().getKey()+"，投票数有"+max6.get().getValue()+"人");
        }else{
            System.out.println("没有投票");
        }


        //找出哪些同学没有选择投票最多的去处，输出他们的名字
        System.out.println("没有去"+max.get().getKey()+"的同学有：");
        //方式一：
        for(TStudent_01 student : students){
            if(!student.getAddressList().contains(max.get().getKey())){
                System.out.println(student.getName());
            }
        }
        System.out.println("-------------------------------------------");

        //方式二：
        for(TStudent_01 student : students){
            if(student.getAddressList().stream().noneMatch(address -> address.equals(max.get().getKey()))){
                System.out.println(student.getName());
            }
        }
        System.out.println("-------------------------------------------");

        //方式三:filter
        for(TStudent_01 student : students){
            if(student.getAddressList().stream().filter(address -> address.equals(max.get().getKey())).count()==0){
                System.out.println(student.getName());
            }
        }
        System.out.println("-------------------------------------------");

        //方式四：filter forEach  有问题有待研究。。。
        for(TStudent_01 student : students){
          //List<String> s = student.getAddressList().stream().collect(Collectors.toList());
          //  System.out.println(s);

            student.getAddressList().stream().filter(address -> address.contains(max.get().getKey()))
                    .forEach(address -> System.out.println(student.getName()));

        }
        System.out.println("-------------------------------------------");



        //课堂方式
        students.stream()
                .filter(student -> !student.getAddressList().contains(max.get().getKey()))
                .forEach(student -> System.out.println(student.getName()+"没有选择"+max.get().getKey()));

        System.out.println(students.stream()
                .filter(student -> !student.getAddressList().contains(max.get().getKey())).collect(Collectors.toList()));















    }

}
