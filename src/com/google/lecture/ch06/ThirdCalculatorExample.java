package com.google.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {

		ThirdCalculator tc = new ThirdCalculator();
		
		
		double result1 = tc.areaRectangle(5);		// 정사각형
		
		double result2 = tc.areaRectangle(4, 6);	// 직사각형
		
		System.out.println("사각형의 넓이는 " + result1 + "입니다.");
		
		System.out.println("사각형의 넓이는 " + result2 + "입니다.");
	}

}
