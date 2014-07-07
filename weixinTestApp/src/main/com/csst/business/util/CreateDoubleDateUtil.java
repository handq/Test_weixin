package com.csst.business.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;


/***
 * 创建两个周 从星期日到星期六
 * 
 * @author wanghao
 * 
 */
public class CreateDoubleDateUtil {
	public static void main(String[] args) {
		List<Date> lists=CreateDoubleDateUtil.doubleWeekDate();
		SimpleDateFormat sf=new SimpleDateFormat("d");
		for(int i=0;i<lists.size();i++){
			System.out.println(sf.format(lists.get(i)));
		}
	}

	public static List<Date> doubleWeekDate() {
		List<Date> lists = new ArrayList<Date>();

		SimpleDateFormat format = new SimpleDateFormat("yyy年M月d日 EH时m分s秒",
				Locale.CHINA);
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.setTimeInMillis(System.currentTimeMillis());
		/** 第一天 */
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		
		for(int i=0;i<14;i++){
			Calendar calendarTemp=Calendar.getInstance(Locale.CHINA);
			calendarTemp.setTime(calendar.getTime());
			calendarTemp.set(Calendar.DAY_OF_MONTH, 
					calendarTemp.get(Calendar.DAY_OF_MONTH)+i);
			lists.add(calendarTemp.getTime());
		}
		
		return lists;
	}
	
	
	

}
