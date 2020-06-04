package com.kimschool.manage.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.jpa.criteria.expression.function.AggregationFunction.SUM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.kimschool.manage.dao.WbsDao;
import com.kimschool.manage.entity.User_Info;
import com.kimschool.manage.entity.Wbs;
import com.kimschool.manage.entity.WbsInfoVo;
import com.kimschool.manage.entity.Wbs_2020;
import com.kimschool.manage.entity.WorkPlaceInfo;
import com.kimschool.manage.service.utile.DateUtil;

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
//			mv.addObject("u_password", u_password);
		} else {
			mv.setViewName("home");
		}
		return mv;
	}

	@Override
	public ModelAndView wbsLoginMove(String u_no) {

//		ModelAndView mv = new ModelAndView("wbs");
//		
//		List<User_Info> resultUser = wbsDao.getuserinfo(u_no);
//		List<WorkPlaceInfo> resultWork = wbsDao.getworkplaceinfo(u_no);
//		WbsInfoVo wbsinfo = new WbsInfoVo();
//		DateUtil dateUtil = new DateUtil();
//
//		// USERINFO
//		wbsinfo.setU_name(resultUser.get(0).getName());
//		wbsinfo.setNo(resultUser.get(0).getU_no());
//		// WORKINFO
//		wbsinfo.setMin_time(String.valueOf(resultWork.get(0).getMin_time()));
//		wbsinfo.setMax_time(String.valueOf(resultWork.get(0).getMax_time()));
//		// WBSINFO
//		wbsinfo.setResultlist(wbsDao.getwbs2020(u_no));
//
//		mv.addObject("wbsinfo", wbsinfo);
//
//		return mv;

		ModelAndView mv = new ModelAndView("wbs");

		List<User_Info> resultUser = wbsDao.getuserinfo(u_no);
		List<Wbs_2020> resultWbs = wbsDao.getwbs2020(u_no);
		List<WorkPlaceInfo> resultWork = wbsDao.getworkplaceinfo(u_no);
		WbsInfoVo vo = new WbsInfoVo();
		List<Wbs> wbsList = new ArrayList<Wbs>();
		DateUtil dateUtil = new DateUtil();

		// USERINFO
		vo.setU_name(resultUser.get(0).getName());
		vo.setNo(resultUser.get(0).getU_no());
		// WORKINFO
		vo.setMin_time(String.valueOf(resultWork.get(0).getMin_time()));
		vo.setMax_time(String.valueOf(resultWork.get(0).getMax_time()));
		// WBSINFO
		Float totlaTime = 0f;
		for (Wbs_2020 wbs : resultWbs) {
			Wbs wbsvo = new Wbs();
			wbsvo.setDate(wbs.getDate());
			wbsvo.setStart_h(wbs.getStart_time().substring(0, 2));
			wbsvo.setStart_m(wbs.getStart_time().substring(2));
			wbsvo.setEnd_h(wbs.getEnd_time().substring(0, 2));
			wbsvo.setEnd_m(wbs.getEnd_time().substring(2));
			Float totalCount = dateUtil.timeConv(wbs.getStart_time(), wbs.getEnd_time(), wbs.getRest_time());
			if (totalCount != 0) {
				vo.setDayCount(vo.getDayCount() + 1);
				totlaTime = totlaTime + totalCount;
			}
			String total = String.format("%.2f", totalCount);
			wbsvo.setTotal_h(total);
			wbsvo.setVacation_type(dateUtil.vacationCatconv(wbs.getVacation_type()));
			wbsvo.setMemo(wbs.getMemo());
			wbsList.add(wbsvo);
		}
		vo.setTotalTime(String.format("%.2f", totlaTime));
		vo.setWbslist(wbsList);

		mv.addObject("wbsinfo", vo);

		return mv;
	}

//	@Override
//	public List wbsCheckA(String id, String password) {
//
//		User_Info userinfo = new User_Info();
//
//		userinfo.setU_no(id);
//		userinfo.setU_password(password);
//
//		List<User_Info> result = wbsDao.findWbsA(id, password);
//		return wbsDao.findWbsA(id, password);
//	}
//
//	@Override
//	public List wbsCheckB(String id) {
//
//		Wbs_2020 wbs_2020 = new Wbs_2020();
//		wbs_2020.setU_no(id);
//
//		List<Wbs_2020> result = wbsDao.findWbsB(id);
//		return wbsDao.findWbsB(id);
//	}
//
//	@Override
//	public List wbsCheckC(String id) {
//
//		WorkPlaceInfo workplaceinfo = new WorkPlaceInfo();
//		workplaceinfo.setU_no(id);
//
//		List<WorkPlaceInfo> result = wbsDao.findWbsC(id);
//		return wbsDao.findWbsC(id);
//	}

}