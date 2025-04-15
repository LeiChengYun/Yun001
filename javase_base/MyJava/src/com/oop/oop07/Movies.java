package com.oop.oop07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Movies
 * @Author ChengYun
 * @Date 2025-03-18  17:21
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Movies {
    private int id;
    private String name;
    private String score;
    private String director;
}
