package com.dingli.shop.po;

public class MenusVo {
    private Integer id;
    private String authName;
    private String path;
    private MenusVo children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthName() {
        return authName;
    }

    public void setAuthName(String authName) {
        this.authName = authName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public MenusVo getChildren() {
        return children;
    }

    public void setChildren(MenusVo children) {
        this.children = children;
    }
}
