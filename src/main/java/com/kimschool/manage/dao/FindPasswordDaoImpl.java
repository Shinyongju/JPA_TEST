package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.User_Info;

@Repository
public class FindPasswordDaoImpl implements FindPasswordDao{
	
	@Autowired
	Connection conn;
	
	@Override
	public String findUserInfo(String id, String name) {
		EntityManager em = conn.getConnection();
		
		List<User_Info> resultA = em.createNamedQuery("User_Info.findPassword", User_Info.class).
				setParameter("name", name).
				setParameter("id", id).
				getResultList();
		
		String resultSet = new String();
		if(resultA.size() >0) {
		String result = resultA.toString();
		String[] resultTemp = result.split(",");
		int checkCount = resultTemp[2].indexOf('='); 
		String setPass = resultTemp[2].substring(checkCount+1);
		String first = setPass.substring(0, 1);
		String last = setPass.substring(setPass.length()-1, setPass.length());
		if(setPass.length() >2) {
			resultSet = "당신의 비밀번호는 "+first+"..."+last+" 입니다.";
		}else {
			resultSet = "당신의 비밀번호 앞자리는 "+first+" 입니다.";
		}
		}else {
			resultSet = "없는 아이디입니다.";
		}
		
		return resultSet;
		
	}

}