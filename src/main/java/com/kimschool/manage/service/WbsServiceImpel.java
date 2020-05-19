package com.kimschool.manage.service;

import java.util.List;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction.SUM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.WbsInfoVo;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.Workplaceinfo;

@Service
public class WbsServiceImpel implements WbsService {

	@Autowired
	WbsDao wbsDao;

	@Override
	public ModelAndView wbsLoginCheck(String u_no, String u_password) {

		List<User_Info> resultUser = wbsDao.wbsLoginCheck(u_no, u_password);

		int count = resultUser.size();

		ModelAndView mv = new ModelAndView();

		if (count == 1) {
			mv.setViewName("redirect:/wbsLoginMove");
			mv.addObject("u_no", u_no);
			mv.addObject("u_password", u_password);
		} else {
			mv.setViewName("home");
		}
		return mv;
	}

	@Override
	public ModelAndView wbsLoginMove(String u_no, String u_password) {

		List<User_Info> resultUser = wbsDao.wbsLoginCheck(u_no, u_password);
		List<Wbs_2020> resultWbs = wbsDao.findWbsB(u_no);
		List<Workplaceinfo> resultWork = wbsDao.findWbsC(u_no);
		WbsInfoVo wbsinfo = new WbsInfoVo();

		// USERINFO
		wbsinfo.setName(resultUser.get(0).getName());
		wbsinfo.setNo(resultUser.get(0).getU_no());
		// WORKINFO
		wbsinfo.setMin_time(resultWork.get(0).getMin_time());
		wbsinfo.setMax_time(resultWork.get(0).getMax_time());
		// WBSINFO
		wbsinfo.setResultlist(wbsDao.findWbsB(u_no));

		ModelAndView mv = new ModelAndView();

		mv.setViewName("wbs");
		mv.addObject("wbsinfo", wbsinfo);

		return mv;
	}

	@Override
	public List wbsCheckA(String id, String password) {

		User_Info userinfo = new User_Info();

		userinfo.setU_no(id);
		userinfo.setU_password(password);

		List<User_Info> result = wbsDao.findWbsA(id, password);
		return wbsDao.findWbsA(id, password);
	}

	@Override
	public List wbsCheckB(String id) {

		Wbs_2020 wbs_2020 = new Wbs_2020();
		wbs_2020.setU_no(id);

		List<Wbs_2020> result = wbsDao.findWbsB(id);
		return wbsDao.findWbsB(id);
	}

	@Override
	public List wbsCheckC(String id) {

		Workplaceinfo workplaceinfo = new Workplaceinfo();
		workplaceinfo.setU_no(id);

		List<Workplaceinfo> result = wbsDao.findWbsC(id);
		return wbsDao.findWbsC(id);
	}

}