package com.dingli.shop.biz.impl;

import com.dingli.shop.biz.MenusBiz;
import com.dingli.shop.dao.MenusDao;
import com.dingli.shop.po.MenusVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenusBizImpl implements MenusBiz {
    @Autowired
    private MenusDao menusDao;
    @Override
    public List<MenusVo> findMenus() {
        try {
            return menusDao.findMenus();
        }catch (Exception e){
            return null;
        }

    }
}
