package com.google.lecture.ch10.exceptionHandling;

public class TryCatchFinallyExample {

	public static void main(String[] args) {

		try {
			Class clazz = Class.forName("java.langg.String2");
		} catch (ClassNotFoundException e) {
			/* e.printStackTrace(); */
			System.out.println("클래스가 존재하지 않습니다.");
		}
		
	}

}
