package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Workplaceinfo;

@Repository
public class WbsDaoImpl implements WbsDao {
	
	@Autowired
	Connection conn;

	public List findWbsA(String id, String password) {
		EntityManager em = conn.getConnection();
		
		List<User_Info> result = em.createNamedQuery("User_Info.findBypassword", User_Info.class).
				setParameter("password", password).
				setParameter("id", id).
				getResultList();
		
		return result;
	}
	
	public List findWbsB(String id) {
		EntityManager em = conn.getConnection();
		
		List<Wbs_2020> result = em.createNamedQuery("Wbs_2020.findWbs", Wbs_2020.class).
				setParameter("id", id).
				getResultList();
		
		return result;
	}
	
	public List findWbsC(String id) {
		EntityManager em = conn.getConnection();
		
		List<Workplaceinfo> result = em.createNamedQuery("Workplaceinfo.findByWbs", Workplaceinfo.class).
				setParameter("id", id).
				getResultList();
		
		return result;
	}

}