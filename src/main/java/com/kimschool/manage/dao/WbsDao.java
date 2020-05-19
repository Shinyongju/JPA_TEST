package com.kimschool.manage.dao;

import java.util.List;

import com.kimschool.manage.entity.User_Info;

public interface WbsDao {

	public List<User_Info> wbsLoginCheck(String u_no, String u_password);

	public List findWbsA(String id, String password);

	public List findWbsB(String id);

	public List findWbsC(String id);

}