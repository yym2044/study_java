package com.google.lecture.ch03;

public class StringEqualsExample {
	
	public static void main(String[] args) {
		
		String str1 = "장원영";
		String str2 = "장원영";
		String str3 = new String("장원영");
		
		boolean result1 = (str1 == str2);	// 주소 값을 비교
		System.out.println("result1 = " +result1);	
		boolean result2 = (str1 == str3);
		System.out.println("result2 = " +result2);	// 주소 값이 다름
		
		System.out.println("str1.equals(str2): " + str1.equals(str2));	// value를 비교
		System.out.println("str1.equals(str3): " + str1.equals(str3));
		
		System.out.println("----------------------------");
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str3));
	}

}
