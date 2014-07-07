package com.csst.business.util;

import java.util.Random;

public class SixNumberFactory {
	/***
	 * 生成六位数的验证码
	 * @return
	 */
	public static Integer createSixNumber(){
		Integer temp=new Random().nextInt(1000000);
		while(temp<=99999){
			temp=new Random().nextInt(1000000);
		}
		return temp;
	}
}
