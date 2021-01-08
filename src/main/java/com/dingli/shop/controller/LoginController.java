package com.dingli.shop.controller;


import com.dingli.shop.biz.MenusBiz;
import com.dingli.shop.biz.UserBiz;
import com.dingli.shop.po.MenusVo;
import com.dingli.shop.po.UserVO;
import com.dingli.shop.utils.JwtUtils;
import com.dingli.shop.vo.JsonVo;
import com.dingli.shop.vo.Meta;
import com.dingli.shop.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class LoginController {
  @Autowired
  private JwtUtils jwt;
  @Autowired
  private UserBiz userBiz;
  private MenusBiz menusBiz;
  @PostMapping("/login")
  public @ResponseBody JsonVo login(@RequestBody User user){
    UserVO userVO = userBiz.findUser(user);
    JsonVo jsonVo = new JsonVo();
    Meta meta = new Meta();
    if(userVO == null){
      meta.setMsg("用户名或密码错误");
      meta.setStatus(400);
    }else{
      meta.setMsg("登陆成功");
      meta.setStatus(200);
      String subject = userVO.getId()+"";
      Map<String, Object> map = new HashMap<>();
      map.put("user", userVO);
      String token = jwt.createJWT(UUID.randomUUID().toString(), subject, 60 * 60 * 24 * 1000, map);
      userVO.setToken(token);
    }
    jsonVo.setData(userVO);
    jsonVo.setMeta(meta);
    return jsonVo;
  }

  @GetMapping("/menus")
  public @ResponseBody JsonVo menus(@RequestBody MenusVo menusVo){
    JsonVo jsonVo = new JsonVo();
    Meta meta = new Meta();
    MenusVo menusVo1 = menusBiz.findMenus(menusVo);
    if(menusVo1 == null){
      meta.setMsg("获取菜单列表失败");
      meta.setStatus(400);
    }else{
      meta.setMsg("获取菜单列表成功");
      meta.setStatus(200);
    }
    jsonVo.setData(menusVo);
    jsonVo.setMeta(meta);
    return jsonVo;
  }
}
