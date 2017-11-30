package com.wlw.wireless.repository;

import java.util.List;
import java.util.Map;

import com.wlw.wireless.entity.statistics.Statistics;

@MyBatisRepository
public interface StatisticsDao {

	public List<Statistics> getStkStatistics(Map<String,Object> map);
}
