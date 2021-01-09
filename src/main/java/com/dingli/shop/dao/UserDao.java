package com.dingli.shop.dao;

import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;
import com.dingli.shop.vo.User1;

import java.util.List;

public interface UserDao {
  UserVO findUser(User user);//登录界面
  List<User1> findAllUser();//查询所有信息
  List<User1> findSinUser(String username); //查询单个信息
  UserVO selOneUser(Integer id);
  boolean insertUser(User user);//添加信息
  boolean updateUserState(User user); //修改当前状态
  boolean deleteUser(Integer id);//删除该账号
  UserVO updateUser(User user);//更新账户信息
}
