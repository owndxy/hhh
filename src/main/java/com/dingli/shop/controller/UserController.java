package com.dingli.shop.controller;

import com.dingli.shop.biz.UserBiz;
import com.dingli.shop.po.PageVo;
import com.dingli.shop.po.UserUSVo;
import com.dingli.shop.vo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserBiz userBiz;
    @GetMapping("/users")
    public @ResponseBody JsonVo getAll(QueryInfo queryInfo){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        List<User1> user1s = null;
        PageVo pageVos = new PageVo();
        if(queryInfo.getQuery().isEmpty()){
            user1s =  userBiz.findAllUser();
        }else{
            user1s = userBiz.findSinUser(queryInfo.getQuery());
        }
        pageVos.setTotal(user1s.size());
        pageVos.setPagenum((user1s.size()/queryInfo.getPagesize())+ queryInfo.getPagenum());
        pageVos.setUsers(user1s);
        if(pageVos==null){
            meta.setMsg("用户名已存在");
            meta.setStatus(400);
        }else{
            meta.setMsg("获取成功");
            meta.setStatus(200);
        }
//        System.out.println(queryInfo.getQuery());
        jsonVo.setMeta(meta);
        jsonVo.setData(pageVos);
        return jsonVo;
    }
    @PostMapping("/users")
    public @ResponseBody JsonVo insert(@RequestBody User user){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println(user.getUsername());
        System.out.println(user.getMobile());
        long create_time= new Date().getTime();
        user.setCreate_time(create_time);
        boolean f= userBiz.insertUser(user);
        if(f==false){
            meta.setMsg("用户名已存在");
            meta.setStatus(400);
        }else{
            meta.setMsg("用户创建成功");
            meta.setStatus(201);
        }

        jsonVo.setData(user);
        jsonVo.setMeta(meta);
        return jsonVo;
    }
    @PutMapping("/users/{uId}/state/{type}")
    public @ResponseBody JsonVo updateUserState(@PathVariable Integer uId,@PathVariable boolean type){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        System.out.println(type);
        System.out.println(uId);
        boolean f2 = userBiz.updateUserState(uId,type);
        if(f2){
            meta.setMsg("设置状态成功");
            meta.setStatus(200);
        }else {
            meta.setMsg("设置状态失败");
            meta.setStatus(400);
        }
        jsonVo.setData(null);
        jsonVo.setMeta(meta);
        return jsonVo;
    }
}
