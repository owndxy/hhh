package com.dingli.shop.biz.impl;

import com.dingli.shop.biz.UserBiz;
import com.dingli.shop.dao.UserDao;
import com.dingli.shop.vo.User;
import com.dingli.shop.po.UserVO;
import com.dingli.shop.vo.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBizImpl implements UserBiz {
  @Autowired
  private UserDao userDao;

  @Override
  public UserVO findUser(User user) {
    try {
      return userDao.findUser(user);
    }catch (Exception e){
      return null;
    }
  }

  @Override
  public List<User1> findAllUser() {
    try {
      return userDao.findAllUser();
    }catch (Exception e){
      return null;
    }
  }

  @Override
  public List<User1> findSinUser(String username) {
    try {
      return userDao.findSinUser(username);
    }catch (Exception e){
      return null;
    }
  }

  @Override
  public UserVO selOneUser(Integer id) {
    try {
      return userDao.selOneUser(id);
    }catch (Exception e){
      return null;
    }
  }

  @Override
  public boolean insertUser(User user) {
    try{
      return userDao.insertUser(user);
    }catch (Exception e){
      return false;
    }

  }

  @Override
  public boolean updateUserState(User user) {
    try{
      return userDao.updateUserState(user);
    }catch (Exception e){
      return false;
    }
  }

  @Override
  public boolean deleteUser(Integer id) {
    try{
      return userDao.deleteUser(id);
    }catch (Exception e){
      return false;
    }
  }

  @Override
  public UserVO updateUser(User user) {
    try {
      return userDao.updateUser(user);
    }catch (Exception e){
      return null;
    }
  }
}
