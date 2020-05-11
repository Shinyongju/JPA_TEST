package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.LoginDao;
import com.kimschool.manage.dao.RegUserDao;
import com.kimschool.manage.entity.User_Info;

@Service
public class RegUserServiceImpe implements RegUserService {
	
	@Autowired
	RegUserDao dao;
	
	@Override
	public int insertUserInfo(String id, String password) {
		
		User_Info userinfo = new User_Info();
		userinfo.setU_no(id);
		userinfo.setPassword(password);
		
		int result = dao.insertUserInfo(userinfo);
		return result;
	}

}