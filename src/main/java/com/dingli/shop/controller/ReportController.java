package com.dingli.shop.controller;

import com.dingli.shop.biz.ReportBiz;
import com.dingli.shop.po.ReportVo;
import com.dingli.shop.vo.JsonVo;
import com.dingli.shop.vo.Meta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReportController {
    @Autowired
   private ReportBiz reportBiz;
    @GetMapping("reports/type/1")
    public @ResponseBody JsonVo getChart(){
        JsonVo jsonVo = new JsonVo();
        Meta meta = new Meta();
        ReportVo reportVo = reportBiz.getChart();
        if(reportVo==null){
            meta.setStatus(400);
            meta.setMsg("获取报表失败");
        }else {
            meta.setStatus(200);
            meta.setMsg("获取报表失败");
        }
        jsonVo.setData(reportVo);
        jsonVo.setMeta(meta);
        return jsonVo;
    }

}
