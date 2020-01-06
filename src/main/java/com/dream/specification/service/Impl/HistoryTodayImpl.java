package com.dream.specification.service.Impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dream.specification.constants.HistoryTodayContants;
import com.dream.specification.domain.HistoryToday;
import com.dream.specification.mapper.HistoryTodayMapper;
import com.dream.specification.service.HistoryTodayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HistoryTodayImpl implements HistoryTodayService {

    @Autowired
    private HistoryTodayMapper historyTodayMapper;

    @Autowired
    private HistoryToday historyToday;

    @Override
    public Map getEventList(String day) {
        Map map = new HashMap();
        map.put("err_code","0");
        map.put("msg","success");
//        historyToday.setDay(day);

        List<HistoryToday> list = historyTodayMapper.selectList(new QueryWrapper<HistoryToday>().eq("day","12/24"));
        if (list.size()>0){
            map.put("list",list);
        }
        return map;
    }

    @Override
    public void insertEvent(String day) {
        Map<String,Object> paramMap = new HashMap<>();
        paramMap.put("appid", HistoryTodayContants.APPID);
        paramMap.put("date", day);
        String resultStr = HttpUtil.get(HistoryTodayContants.HISTORY_EVENT_URL,paramMap);
        Map result = JSONUtil.toBean(resultStr,Map.class);
        List<Map> list = (List<Map>) result.get("data");
        for (Map map1:list){
            historyToday.setEid((String) map1.get("eid"));
            historyToday.setTitle((String) map1.get("title"));
            historyToday.setImgUrl((String) map1.get("img"));
            historyToday.setDate((String) map1.get("date"));
            historyToday.setDay((String) map1.get("day"));
            historyTodayMapper.insert(historyToday);
        }
    }

    @Override
    public Map getDetail(String eid) {
        return null;
    }

    @Override
    public void insertDetail(String eid) {

    }


}
