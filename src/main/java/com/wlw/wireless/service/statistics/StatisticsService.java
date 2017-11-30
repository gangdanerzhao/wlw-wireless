package com.wlw.wireless.service.statistics;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.wlw.wireless.entity.statistics.Statistics;
import com.wlw.wireless.repository.StatisticsDao;

@Component
@Transactional
public class StatisticsService {

	private static Logger logger = LoggerFactory.getLogger(StatisticsService.class);
	
	@Autowired
	StatisticsDao statisticsDao;
	
	public List<Statistics> getStkStatistics(Map<String,Object> map){
		return statisticsDao.getStkStatistics(map);
	}
}
