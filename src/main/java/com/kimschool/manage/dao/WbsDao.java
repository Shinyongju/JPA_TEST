package com.kimschool.manage.dao;

import java.util.List;

import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;

public interface WbsDao {

	public List<User_Info> wbsLoginCheck(String u_no, String u_password);
	
	public List<Wbs_2020> getwbs2020(String u_no);
	
	public List<User_Info> getuserinfo(String u_no);
	
	public List<WorkPlaceInfo> getworkplaceinfo(String u_no);

//	public List findWbsA(String id, String password);
//
//	public List findWbsB(String id);
//
//	public List findWbsC(String id);

}