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
	public String findUserInfo(String id, String name) {

		User_Info userinfo = new User_Info();
		userinfo.setU_no(id);
		userinfo.setName(name);

		String result = dao.findUserInfo(id, name);
		return result;
	}

}