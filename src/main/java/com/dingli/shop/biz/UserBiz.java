package com.dingli.shop.biz;

import com.dingli.shop.po.UserUSVo;
import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;
import com.dingli.shop.vo.User1;

import java.util.List;

public interface UserBiz {
  UserVO findUser(User user);
  List<User1> findAllUser();
  List<User1> findSinUser(String username);
  boolean insertUser(User user);
  boolean updateUserState(Integer id,Boolean type);
}
