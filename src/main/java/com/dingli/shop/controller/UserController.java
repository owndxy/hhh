package com.dingli.shop.controller;

import com.dingli.shop.biz.UserBiz;
import com.dingli.shop.po.UserInVo;
import com.dingli.shop.po.UserUSVo;
import com.dingli.shop.po.UserVO;
import com.dingli.shop.vo.JsonVo;
import com.dingli.shop.vo.Meta;
import com.dingli.shop.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    @Autowired
    private UserBiz userBiz;
    @PostMapping("/users")
    public @ResponseBody JsonVo insert(@RequestBody User user){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        UserInVo userInVo = userBiz.insertUser(user);
        if(userInVo==null){
            meta.setMsg("用户名已存在");
            meta.setStatus(400);
        }else{
            meta.setMsg("用户创建成功");
            meta.setStatus(201);
        }

        jsonVo.setData(meta);
        jsonVo.setData(userInVo);
        return jsonVo;
    }
    @PutMapping("/users/{uId}/state/{type}")
    public @ResponseBody JsonVo updateUserState(@PathVariable Integer uId,@PathVariable boolean type){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
//        if(type){
        UserUSVo userUSVo = userBiz.updateUserState(uId,type);
        meta.setMsg("设置状态成功");
        meta.setStatus(200);
        jsonVo.setData(userUSVo);
        jsonVo.setMeta(meta);
        return null;
    }
}
