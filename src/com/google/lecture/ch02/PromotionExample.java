package com.google.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {

		// 작은 놈이 큰놈으로 변환은 문제가 발생하지 않는다
		// 하지만 큰놈이 작은놈으로 변환은 문제가 생긴다
		
		// byte < short < int < long
		// float < double
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;
		System.out.println(longValue);
		
		intValue = 200;
		float floatValue = intValue;
		System.out.println(floatValue);
	
		double doubleValue = intValue; 
		System.out.println(doubleValue);
		 
	}

}
