package com.dingli.shop.biz;

import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;
import com.dingli.shop.vo.User1;

import java.util.List;

public interface UserBiz {
  UserVO findUser(User user);
  List<User1> findAllUser();
  List<User1> findSinUser(String username);
  UserVO selOneUser(Integer id);
  boolean insertUser(User user);
  boolean updateUserState(User user);
  boolean deleteUser(Integer id);
  UserVO updateUser(User user);//更新账户信息
}
