package com.demo.utils;

import java.util.Date;

public class DateUtils {
	public static void main(String a[]){
		System.out.println(getLocalCurrentDate());
	}
	private static Date getLocalCurrentDate(){
		return new Date();
	}
	@SuppressWarnings("deprecation")
	private static void getLocalCurrentDateMonth() {
		System.out.println(new Date().getMonth());
	}
}

