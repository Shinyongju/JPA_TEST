package com.kimschool.manage.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;

@Repository
public class WbsDaoImpl implements WbsDao {

	@Autowired
	Connection conn;
	
	public List<User_Info> wbsLoginCheck(String u_no, String u_password) {
		EntityManager em = conn.getConnection();
		List<User_Info> result = em.createNamedQuery("User_Info.findByUserInfo", User_Info.class)
				.setParameter("u_no", u_no).setParameter("u_password", u_password).getResultList();

		return result;
	}
	
	public List<Wbs_2020> getwbs2020(String u_no) {
		EntityManager em = conn.getConnection();

		List<Wbs_2020> result = em.createNamedQuery("Wbs_2020.findByu_no", Wbs_2020.class).setParameter("u_no", u_no)
				.getResultList();

		return result;
	}

	public List<User_Info> getuserinfo(String u_no) {
		EntityManager em = conn.getConnection();

		List<User_Info> result = em.createNamedQuery("User_Info.findByu_no", User_Info.class).setParameter("u_no", u_no)
				.getResultList();

		return result;
	}

	public List<WorkPlaceInfo> getworkplaceinfo(String u_no) {
		EntityManager em = conn.getConnection();

		List<WorkPlaceInfo> result = em.createNamedQuery("WorkPlaceInfo.findByu_no", WorkPlaceInfo.class).setParameter("u_no", u_no)
				.getResultList();

		return result;
	}

//	public List findWbsA(String id, String password) {
//		EntityManager em = conn.getConnection();
//
//		List<User_Info> result = em.createNamedQuery("User_Info.findBypassword", User_Info.class)
//				.setParameter("password", password).setParameter("id", id).getResultList();
//
//		return result;
//	}
//
//	public List findWbsB(String id) {
//		EntityManager em = conn.getConnection();
//
//		List<Wbs_2020> result = em.createNamedQuery("Wbs_2020.findWbs", Wbs_2020.class).setParameter("id", id)
//				.getResultList();
//
//		return result;
//	}
//
//	public List findWbsC(String id) {
//		EntityManager em = conn.getConnection();
//
//		List<WorkPlaceInfo> result = em.createNamedQuery("Workplaceinfo.findByWbs", WorkPlaceInfo.class)
//				.setParameter("id", id).getResultList();
//
//		return result;
//	}

}