package com.Work.Day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description Student_01
 * @Author ChengYun
 * @Date 2025-03-31  22:03
 */
public class TStudent_01 {
    private String name;
    private List<String> addressList;

    public TStudent_01(String name, List<String> addressList) {
        this.name = name;
        this.addressList = addressList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<String> addressList) {
        this.addressList = addressList;
    }

    @Override
    public String toString() {
        return "TStudent_01{" +
                "name='" + name + '\'' +
                ", adressList=" + addressList +
                '}';
    }
}
