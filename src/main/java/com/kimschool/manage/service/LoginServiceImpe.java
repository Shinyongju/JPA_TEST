package com.kimschool.manage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kimschool.manage.dao.LoginDao;

@Service
public class LoginServiceImpe implements LoginService {

	@Autowired
	LoginDao logindao;

	@Override
	// 화면 컨트롤러 서비스 다오 순으로 값 넘겨줌
	public int checkLogin(String id, String password) {

		int count = logindao.findUser(id, password);

		return count;
	}

}