package com.google.lecture.ch06;

public class TelevisionExample {

	public static void main(String[] args) {

		System.out.println("Television.company : " + Television.company);
		System.out.println("Television.model : " + Television.model);
		System.out.println("Television.info : " + Television.info);
		System.out.println("Television.info2 : " + Television.info2);
		
		Television television = new Television();
		
//		객체 생성해서 사용하는 것도 가능 그러나 이렇게 쓰는 사람 없음
		System.out.println("television.company : " + television.company);
		System.out.println("television.company : " + television.model);
		System.out.println("television.company : " + television.info);
		System.out.println("television.company : " + television.info2);
		
	}

}
