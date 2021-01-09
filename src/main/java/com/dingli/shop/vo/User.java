package com.dingli.shop.vo;


public class User {
  private Integer uId;
  private boolean type;
  private String username;
  private String password;
  private String email;
  private String mobile;
  private long create_time;

  public long getCreate_time() {
    return create_time;
  }

  public void setCreate_time(long create_time) {
    this.create_time = create_time;
  }

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public User(String username, String password, String email, String mobile,Integer create_time) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.mobile = mobile;
    this.create_time = create_time;
  }

  public User(Integer uId, boolean type) {
    this.uId = uId;
    this.type = type;
  }

  public Integer getuId() {
    return uId;
  }

  public void setuId(Integer uId) {
    this.uId = uId;
  }

  public boolean getType() {
    return type;
  }

  public void setType(boolean type) {
    this.type = type;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public User() {
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}
