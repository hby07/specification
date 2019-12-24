package com.dream.specification.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dream.specification.domain.HistoryToday;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HistoryTodayMapper extends BaseMapper<HistoryToday> {
    int insert(HistoryToday historyToday);

    List<HistoryToday> selectList(@Param("day") String day);

}
