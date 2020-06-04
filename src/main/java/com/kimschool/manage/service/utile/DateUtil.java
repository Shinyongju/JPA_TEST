package com.kimschool.manage.service.utile;

public class DateUtil {

	// 근무형태변환
	// 0 -> 미표시
	// 1 -> 오전휴가
	// 2 -> 오휴휴가
	// 3 -> 종일휴가
	// 4 -> 조퇴

	public String vacationCatconv(String vacationCode) {
		if ("0".equals(vacationCode)) {
			return "";
		} else if ("1".equals(vacationCode)) {
			return "오전휴가";
		} else if ("2".equals(vacationCode)) {
			return "오후휴가";
		} else if ("3".equals(vacationCode)) {
			return "종일휴가";
		} else if ("4".equals(vacationCode)) {
			return "조퇴";
		} else {
			return "";
		}
	}

	public float timeConv(String startTime, String endTime, String restTime) {

		float start_h = Float.parseFloat(startTime.substring(0, 2));
		float start_m = Float.parseFloat(startTime.substring(2, 4));
		float end_h = Float.parseFloat(endTime.substring(0, 2));
		float end_m = Float.parseFloat(endTime.substring(2, 4));
		float rest_h = Float.parseFloat(restTime.substring(0, 2));
		float rest_m = Float.parseFloat(restTime.substring(2, 4));

		while (true) {
			if (end_m - (start_m + rest_m) < 0) {
				end_h = end_h - 1;
				end_m = end_m + 60;
			} else {
				break;
			}
		}

		float totaltime = (end_h - (start_h + rest_h)) + (end_m - (start_m + rest_m)) / 100;

		return totaltime;
	}

}
