package com.kimschool.manage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Workplaceinfo;

@Service
public class WbsServiceImpe implements WbsService {
	
	@Autowired
	WbsDao wbsDao;

	@Override
	public List wbsCheckA(String id, String password) {
		
		User_Info userinfo = new User_Info();
		
		userinfo.setU_no(id);
		userinfo.setPassword(password);
		
		List<User_Info> result = wbsDao.findWbsA(id,password);
		return result;
	}
	
	@Override
	public List wbsCheckB(String id) {
		
		Wbs_2020 wbs_2020 = new Wbs_2020();
		wbs_2020.setU_no(id);
		
		List<Wbs_2020> result = wbsDao.findWbsB(id);
		return result;
	}
	
	@Override
	public List wbsCheckC(String id) {
		
		Workplaceinfo workplaceinfo = new Workplaceinfo();
		workplaceinfo.setU_no(id);
		
		List<Workplaceinfo> result = wbsDao.findWbsC(id);
		return result;
	}
}