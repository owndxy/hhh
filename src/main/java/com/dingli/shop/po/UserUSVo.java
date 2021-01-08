package com.dingli.shop.po;

public class UserUSVo {
    private Integer id;
    private String mobile;
    private String username;
    private Integer rid;
    private String email;
    private Boolean mg_state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getMg_state() {
        return mg_state;
    }

    public void setMg_state(Boolean mg_state) {
        this.mg_state = mg_state;
    }
}