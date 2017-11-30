package com.wlw.wireless.rest.statistics;

import java.util.List;
import java.util.Map;

import javax.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.google.common.collect.Maps;
import com.wlw.wireless.entity.statistics.Statistics;
import com.wlw.wireless.query.Query;
import com.wlw.wireless.service.statistics.StatisticsService;
import com.wlw.wireless.util.BeanValidators;
import com.wlw.wireless.util.MediaTypes;
import com.wlw.wireless.util.PageBean;

@RestController
@RequestMapping(value = "/statistics")
public class StatisticsController {

	private static Logger logger = LoggerFactory.getLogger(StatisticsController.class);
	
	@Autowired
	StatisticsService statisticsService;
	@Autowired
	private Validator validator;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public PageBean<Statistics> getStkStatistics(Query query) {
		BeanValidators.validateWithException(validator, query);
		Map<String,Object> map = Maps.newHashMap();
		map.put("vendorCode", query.getVendorCode());
		PageHelper.startPage(1, 10);
		List<Statistics> list = statisticsService.getStkStatistics(map);//分页插件演示
		return new PageBean<Statistics>(list);
	}
}
