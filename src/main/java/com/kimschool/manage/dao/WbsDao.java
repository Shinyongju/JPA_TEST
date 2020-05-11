package com.kimschool.manage.dao;

import java.util.List;

public interface WbsDao {

	public List findWbsA(String id, String password);
	public List findWbsB(String id);
	public List findWbsC(String id);

}