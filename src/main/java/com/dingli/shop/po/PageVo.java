package com.dingli.shop.po;

import com.dingli.shop.vo.User1;

import java.util.List;

public class PageVo {
    private Integer pagenum;
    private Integer total;
    private List<User1> users;

    public Integer getPagenum() {
        return pagenum;
    }

    public void setPagenum(Integer pagenum) {
        this.pagenum = pagenum;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<User1> getUsers() {
        return users;
    }

    public void setUsers(List<User1> users) {
        this.users = users;
    }
}
