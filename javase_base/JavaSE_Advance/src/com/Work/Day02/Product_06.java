package com.Work.Day02;

import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @Description Product_06
 * @Author ChengYun
 * @Date 2025-03-29  15:26
 */

public class Product_06 {
    private String store;
    private String name;

    public Product_06(String store, String name) {
        this.store = store;
        this.name = name;
    }

    public Product_06() {
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product_06 product06 = (Product_06) o;
        return Objects.equals(store, product06.store) && Objects.equals(name, product06.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(store, name);
    }

}
