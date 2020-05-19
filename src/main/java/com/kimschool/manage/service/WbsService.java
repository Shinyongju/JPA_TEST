package com.kimschool.manage.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

public interface WbsService {

	public ModelAndView wbsLoginCheck(String u_no, String u_password);

	public ModelAndView wbsLoginMove(String u_no, String u_password);

	public List wbsCheckA(String id, String password);

	public List wbsCheckB(String id);

	public List wbsCheckC(String id);

}