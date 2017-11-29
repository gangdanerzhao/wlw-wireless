/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.wlw.wireless.rest;

import java.net.URI;

import javax.validation.Validator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.wlw.wireless.entity.Area;
import com.wlw.wireless.service.area.AreaService;
import com.wlw.wireless.util.BeanValidators;
import com.wlw.wireless.util.MediaTypes;

@RestController
@RequestMapping(value = "/api/v1/area")
public class AreaRestController {

	private static Logger logger = LoggerFactory.getLogger(AreaRestController.class);


	@Autowired
	private AreaService areaService;
	@Autowired
	private Validator validator;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaTypes.JSON_UTF_8)
	public Area get(@PathVariable("id") Long id) {
		Area area = areaService.getArea(1751);
		BeanValidators.validateWithException(validator, area);
		logger.info("this is info");
		logger.debug("this is debug");
		logger.warn("this is warn");
		logger.error("this is error");
		return area;
//		String message = "任务不存在(id:" + id + ")";
//		logger.warn(message);
//		throw new RestException(HttpStatus.NOT_FOUND, message);
	}

//	@RequestMapping(method = RequestMethod.POST, consumes = MediaTypes.JSON)
//	public ResponseEntity<?> create(@RequestBody Task task, UriComponentsBuilder uriBuilder) {
//		// 调用JSR303 Bean Validator进行校验, 异常将由RestExceptionHandler统一处理.
//		BeanValidators.validateWithException(validator, task);
//
//		// 保存任务
//		taskService.saveTask(task);
//
//		// 按照Restful风格约定，创建指向新任务的url, 也可以直接返回id或对象.
//		Long id = task.getId();
//		URI uri = uriBuilder.path("/api/v1/task/" + id).build().toUri();
//		HttpHeaders headers = new HttpHeaders();
//		headers.setLocation(uri);
//
//		return new ResponseEntity(headers, HttpStatus.CREATED);
//	}
//
//	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, consumes = MediaTypes.JSON)
//	// 按Restful风格约定，返回204状态码, 无内容. 也可以返回200状态码.
//	@ResponseStatus(HttpStatus.NO_CONTENT)
//	public void update(@RequestBody Task task) {
//		// 调用JSR303 Bean Validator进行校验, 异常将由RestExceptionHandler统一处理.
//		BeanValidators.validateWithException(validator, task);
//
//		// 保存任务
//		taskService.saveTask(task);
//	}
}
