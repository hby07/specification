package com.dream.specification.controller;


import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.StrUtil;
import com.dream.specification.service.HistoryTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Map;

@RestController
@RequestMapping("/history")
public class HistoryTodayController {

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

}
