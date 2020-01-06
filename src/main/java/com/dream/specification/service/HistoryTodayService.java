package com.dream.specification.service;

import java.util.Map;

public interface HistoryTodayService {
    Map getEventList(String date);
    void insertEvent(String date);
    Map getDetail(String eid);
    void insertDetail(String eid);
}
