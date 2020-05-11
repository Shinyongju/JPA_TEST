package com.kimschool.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.service.FindPasswordService;
import com.kimschool.manage.service.RegUserService;



@Controller
public class FindPasswordController {
	
	@Autowired
	FindPasswordService findPasswordService;
	
	private static final Logger logger = LoggerFactory.getLogger(FindPasswordController.class);
	
	@RequestMapping("/movefindpassword")
	public String movereguser() {
		
		logger.debug("비밀번호찾기 이동처리");
		
		return "findpassword";
	}
	
	
	@RequestMapping("/findpassword")
	public ModelAndView findpassword(String id, String name) {
		// 성공 - home , ${msg} 회원가입완료
		// 실패 - reguser redirect, ${msg} 내용확인
		ModelAndView mv = new ModelAndView();
		
		String result = findPasswordService.findUserInfo(id, name);
		
		if(result.length() == 0) {
			mv.setViewName("redirect:/findpassword");
		}else {
			mv.setViewName("findpassresult");
			mv.addObject("result", result);
		}
		return mv;
	}
	
}
