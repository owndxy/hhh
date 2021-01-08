package com.dingli.shop.dao;

import com.dingli.shop.po.UserInVo;
import com.dingli.shop.po.UserUSVo;
import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;

public interface UserDao {
  UserVO findUser(User user);
  UserInVo insertUser(User user);
  UserUSVo updateUserState(Integer id, Boolean type);
}
