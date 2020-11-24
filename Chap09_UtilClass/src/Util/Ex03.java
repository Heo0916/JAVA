package Util;

import java.util.Calendar;

/*
 * 3. Calendar 클래스
 *    - 날짜 / 시간 관련된 정보를 제공해 주는 클래스.
 */

public class Ex03 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.WEEK_OF_YEAR);
        int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		
		System.out.println("이번 주는 1년 52주 중에 " + week + "번째 주입니다.");
		System.out.println("오늘은 " + year + "년 " + month + " 월 " + day + "일 입니다. ");
		
	}

}
