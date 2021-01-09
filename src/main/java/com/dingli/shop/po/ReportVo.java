package com.dingli.shop.po;

import com.dingli.shop.vo.report.Series;
import com.dingli.shop.vo.report.XAxis;
import com.dingli.shop.vo.report.YAxis;

import java.util.List;

public class ReportVo {
    private List<String> legend;
    private List<Series> series;
    private List<XAxis> xAxis;
    private List<YAxis> yAxis;

    public List<String> getLegend() {
        return legend;
    }

    public void setLegend(List<String> legend) {
        this.legend = legend;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }

    public List<XAxis> getxAxis() {
        return xAxis;
    }

    public void setxAxis(List<XAxis> xAxis) {
        this.xAxis = xAxis;
    }

    public List<YAxis> getyAxis() {
        return yAxis;
    }

    public void setyAxis(List<YAxis> yAxis) {
        this.yAxis = yAxis;
    }
}
