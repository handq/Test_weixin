package com.csst.business.test.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TestTime {
	public static void main(String[] args) {
		SimpleDateFormat format=
				new SimpleDateFormat("yyy年M月d日 EH时m分s秒", Locale.CHINA);
		
		Calendar calendar=Calendar.getInstance(Locale.CHINA);
		//calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		
		calendar.setTimeInMillis(System.currentTimeMillis());
		System.out.println("-->当前时间 "+format.format(calendar.getTime()));
		//第一天
		//calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		//System.out.println("-->第一天 "+format.format(calendar.getTime()));
		
		calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));  
		System.out.println("-->本月最后一天 "+format.format(calendar.getTime()));
		//最后一天
		Calendar calendarMax=Calendar.getInstance();
		calendarMax.setTime(calendar.getTime());
		calendarMax.set(Calendar.DAY_OF_YEAR, calendarMax.get(Calendar.DAY_OF_YEAR)+13);
		System.out.println("--->最后一天"+format.format(calendarMax.getTime()));
		
		//System.out.println("-->周一时间"+format.format(calendar.getTime()));
	}
}
