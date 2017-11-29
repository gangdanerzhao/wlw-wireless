package com.wlw.wireless.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import com.wlw.wireless.entity.Area;

@DirtiesContext
@ContextConfiguration(locations = { "/applicationContext.xml" })
public class AreaDaoTest {

	@Autowired
	private AreaDao areaDao;
	
	@Test
	public void getArea(){
		Area area = areaDao.get(1751);
	}
}
