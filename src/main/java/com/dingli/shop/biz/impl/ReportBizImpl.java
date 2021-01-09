package com.dingli.shop.biz.impl;

import com.dingli.shop.biz.ReportBiz;
import com.dingli.shop.dao.ReportDao;
import com.dingli.shop.po.ReportVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportBizImpl implements ReportBiz {
    @Autowired
    private ReportDao reportDao;


    @Override
    public ReportVo getChart() {
        try {
            return reportDao.getChart();
        }catch (Exception e){
            return null;
        }
    }
}
