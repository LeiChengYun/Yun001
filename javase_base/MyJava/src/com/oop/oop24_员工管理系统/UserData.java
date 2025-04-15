package com.oop.oop24_员工管理系统;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description UserData
 * @Author ChengYun
 * @Date 2025-03-23  20:25
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {
    private int id;
    private String name;
    private String sex;
    private String salary;
    private String department;

}
