package com.kimschool.manage;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.WbsService;

@Controller
public class WbsTestController {

	@Autowired
	WbsService wbsService;

	@RequestMapping(value = "/wbs")
	public ModelAndView init() {

		ModelAndView mv = new ModelAndView("wbs");

		return mv;
	}

	@RequestMapping("/wbsLoginCheck")
	public ModelAndView wbsLoginCheck(String u_no, String u_password) {

		ModelAndView mv = wbsService.wbsLoginCheck(u_no, u_password);

		return mv;
	}

	@RequestMapping("/wbsLoginMove")
	public ModelAndView wbsLoginMove(String u_no) {

		ModelAndView mv = wbsService.wbsLoginMove(u_no);

		return mv;
	}

//	private static final Logger logger = LoggerFactory.getLogger(WbsTestController.class);

//	@RequestMapping("/Wbscheck")
//	public ModelAndView wbscheck(String id, String password) {
//		// 성공 - home , ${msg} 회원가입완료
//		// 실패 - reguser redirect, ${msg} 내용확인
//		ModelAndView mv = new ModelAndView();
//
//		ArrayList<String> resultA = (ArrayList<String>) wbsService.wbsCheckA(id, password);
//		ArrayList<String> resultB = (ArrayList<String>) wbsService.wbsCheckB(id);
//		ArrayList<String> resultC = (ArrayList<String>) wbsService.wbsCheckC(id);
//
//		if (resultA.size() == 0) {
//			mv.setViewName("redirect:/home");
//		} else {
//			mv.setViewName("wbs3");
//			mv.addObject("resultA", resultA);
//			mv.addObject("resultB", resultB);
//			mv.addObject("resultC", resultC);
//		}
//		return mv;
//	}

}