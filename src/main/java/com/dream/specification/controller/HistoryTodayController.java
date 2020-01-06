package com.dream.specification.controller;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import cn.hutool.log.Log;
import cn.hutool.log.LogFactory;
import com.dream.specification.service.HistoryTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/history")
public class HistoryTodayController {

    private static final Log log = LogFactory.get(HistoryTodayController.class);

    @Autowired
    HistoryTodayService historyTodayService;

    @RequestMapping("/getEvent")
    public Map EventList(@RequestParam(required = false) String day){
        if (StrUtil.isBlank(day)){
            day = DateUtil.format(new Date(),"M/d");
        }
        return historyTodayService.getEventList(day);
    }

    @RequestMapping("/insertEvent")
    public void insertEvent(String date){
        if (StrUtil.isBlank(date)){
            date = DateUtil.format(new Date(),"M/d");
        }
        historyTodayService.insertEvent(date);
    }

    @RequestMapping("/getDetail")
    public Map getDetail(String eid){
        Map result = new HashMap();
        if (StrUtil.isBlank(eid)){
            result.put("code","10000");
            result.put("mag","查询参数『eid』不能为空");
            return result;
        }
        return historyTodayService.getDetail(eid);
    }

    @RequestMapping("/insertDetail")
    public void insertDetail(String eid){
        if (StrUtil.isBlank(eid)){
            log.info("eid不能为空：",eid);
        }
        historyTodayService.insertDetail(eid);
    }

}
