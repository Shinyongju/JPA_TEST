package com.kimschool.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.RegUserService;



@Controller
public class RegUserController {
	
	@Autowired
	RegUserService regUserService;
	
	private static final Logger logger = LoggerFactory.getLogger(RegUserController.class);
	
	@RequestMapping("/movereguser")
	public String movereguser() {
		
		logger.debug("회원가입 이동처리");
		
		return "reguser";
	}
	
	@RequestMapping("/reguser")
	public ModelAndView reguser(String id, String password) {
		// 성공 - home , ${msg} 회원가입완료
		// 실패 - reguser redirect, ${msg} 내용확인
		ModelAndView mv = new ModelAndView();
		
		int result = regUserService.insertUserInfo(id, password);
		
		if(result == 0) {
			mv.setViewName("home");
			mv.addObject("msg","ok");
		}else {
			mv.setViewName("redirect:/movereguser");
		}
		return mv;
		
	}
}
