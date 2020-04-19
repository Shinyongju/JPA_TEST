package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.FindPasswordDao;
import com.kimschool.manage.dao.LoginDao;
import com.kimschool.manage.dao.RegUserDao;
import com.kimschool.manage.entity.User_Info;

@Service
public class FindPasswordServiceImpl implements FindPasswordService {
	
	@Autowired
	FindPasswordDao dao;
	
	@Override
	public String findUserInfo(String id, String email1, String email2) {
		
		User_Info userinfo = new User_Info();
		userinfo.setId(id);
		String email = email1+"@"+email2;
		userinfo.setEmail(email);
		
		String result = dao.findUserInfo(id,email);
		return result;
	}

}