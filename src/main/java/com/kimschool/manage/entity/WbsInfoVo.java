package com.kimschool.manage.entity;

import java.util.List;

public class WbsInfoVo {

	private String name;
	private String no;
	private String min_time;
	private String max_time;
	List<WbsInfoVo> resultlist;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getMin_time() {
		return min_time;
	}

	public void setMin_time(String min_time) {
		this.min_time = min_time;
	}

	public String getMax_time() {
		return max_time;
	}

	public void setMax_time(String max_time) {
		this.max_time = max_time;
	}

	public List<WbsInfoVo> getResultlist() {
		return resultlist;
	}

	public void setResultlist(List<WbsInfoVo> resultlist) {
		this.resultlist = resultlist;
	}

	@Override
	public String toString() {
		return "WbsInfoVo [name=" + name + ", no=" + no + ", min_time=" + min_time + ", max_time=" + max_time
				+ ", resultlist=" + resultlist + "]";
	}
}