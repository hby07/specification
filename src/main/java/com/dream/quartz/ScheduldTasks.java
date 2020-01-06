package com.dream.quartz;

import com.dream.specification.service.HistoryTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduldTasks {

    @Autowired
    HistoryTodayService historyTodayService;

    @Scheduled(cron = "0 1 * * * *")
    public void cloneHistoryEvent(){
        historyTodayService.insertEvent("");
    }
}
