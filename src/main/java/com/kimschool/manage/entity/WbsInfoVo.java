package com.kimschool.manage.entity;

import java.util.List;

public class WbsInfoVo {

	private String u_name;
	private String no;
	private String min_time;
	private String max_time;
	private int dayCount;
	private String totalTime;
	private List<Wbs> wbslist;
	private List<Wbs_2020> resultlist;
	
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
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
	public List<Wbs> getWbslist() {
		return wbslist;
	}
	public void setWbslist(List<Wbs> wbslist) {
		this.wbslist = wbslist;
	}
	public List<Wbs_2020> getResultlist() {
		return resultlist;
	}
	public void setResultlist(List<Wbs_2020> resultlist) {
		this.resultlist = resultlist;
	}
	public int getDayCount() {
		return dayCount;
	}
	public void setDayCount(int dayCount) {
		this.dayCount = dayCount;
	}
	public String getTotalTime() {
		return totalTime;
	}
	public void setTotalTime(String totalTime) {
		this.totalTime = totalTime;
	}
	@Override
	public String toString() {
		return "WbsInfoVo [u_name=" + u_name + ", no=" + no + ", min_time=" + min_time + ", max_time=" + max_time
				+ ", dayCount=" + dayCount + ", totalTime=" + totalTime + ", wbslist=" + wbslist + ", resultlist="
				+ resultlist + "]";
	}
}