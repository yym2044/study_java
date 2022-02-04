package com.google.lecture.ch02;

public class Variable {

	public static void main(String[] args) {

		// 변수 명명법
		// 첫글자 소문자 그리고 다음 문자열 부터는 대문자 
		// 모든 변수명은 띄어쓰기 없이 사용
		// 예약어는 사용할 수 없다
		
		// 대소문자를 구분함
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomNumber : " + roomNumber);
		System.out.println("roomnumber : " + roomnumber);
		
		
		int a, b;
		a = 1;
		b = 2;
		System.out.println(a+b);
		
//		escape 문자
		System.out.print("\t탭");
		System.out.println("\n줄바꿈");
		System.out.println("\r줄바꿈");
		
		System.out.println("\'");
		System.out.println("\"");
		System.out.println("\\");
		
//		변수의 범위
//		변수는 선언된 블록 내에서만 사용 가능하다.
		
	}

}
