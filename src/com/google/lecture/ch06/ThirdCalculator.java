package com.google.lecture.ch06;

public class ThirdCalculator {

//	다형성
//	오버로드
	
	public double areaRectangle(double x, double y) {
		
		return x * y;
	}
	
	public double areaRectangle(double x) {
		
		return x * x;
		
	}
}
