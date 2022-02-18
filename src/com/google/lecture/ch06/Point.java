package com.google.lecture.ch06;

import java.util.Date;

public class Point {

//	field
	
	int currentValue;
	String PointType;
	Date getDate;
	Date useDate;
	Date expirationDate;
	String shopPlace;
	
//	method
	
	public int getPoint(int a) {
		return currentValue + a;
	}
	
	public int usePoint(int a) {
		return currentValue - a;
	}
	
	public void seePoint() {
		System.out.println(currentValue);
	}
	
	public void seeIfAvailable(String shopPlace) {
		
		if(shopPlace == "하이마트") {
			System.out.println("사용가능");
		} else {
			System.out.println("사용불가");
		}
	}
	
}
