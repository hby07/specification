package com.dream.quartz;

import cn.hutool.core.date.DateUtil;
import com.dream.specification.service.HistoryTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduldTasks {

    @Autowired
    HistoryTodayService historyTodayService;

    //Seconds Minutes Hours DayofMonth Month DayofWeek Year
    @Scheduled(cron = "0 0 1 * * *")
    public void cloneHistoryEvent(){
        System.out.println("调用定时任务");
        String date = DateUtil.format(new Date(),"M/d");
        historyTodayService.insertEvent(date);
    }
}
