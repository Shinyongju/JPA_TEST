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
	public String findUserInfo(String id, String email) {
		EntityManager em = conn.getConnection();
		
//		List<User_Info> resultA = em.createNamedQuery("User_Info.findPassword", User_Info.class).
//				setParameter("email", email).
//				setParameter("id", id).
//				getResultList();
//		
//		String resultSet = resultA.toString();
//		
//		return resultSet;
		
		String resultB = em.createNamedQuery("User_Info.findPassword", User_Info.class).
				setParameter("email", email).
				setParameter("id", id).
				getSingleResult().getPassword();
		
		return resultB;
		
	}

}