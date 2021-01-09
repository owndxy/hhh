package com.dingli.shop.vo.report;

import java.util.List;

public class Series {
    private String name;
    private List<Integer> user_conut;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getUser_conut() {
        return user_conut;
    }

    public void setUser_conut(List<Integer> user_conut) {
        this.user_conut = user_conut;
    }
}
