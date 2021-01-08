package com.dingli.shop.biz;

import com.dingli.shop.po.UserInVo;
import com.dingli.shop.po.UserUSVo;
import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;

public interface UserBiz {
  UserVO findUser(User user);
  UserInVo insertUser(User user);
  UserUSVo updateUserState(Integer id,Boolean type);
}
