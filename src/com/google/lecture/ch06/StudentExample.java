package com.google.lecture.ch06;

public class StudentExample {

	public static void main(String[] args) {

//		객체 생성 방법
		Student student = new Student();
		
		Student student1;
		student1 = new Student();
		
//		객체는 참조형 변수라서 아래처럼 하면 알수 없는 주소값이 보여진다.
		System.out.println("student: " + student);
		System.out.println("student1: " + student1);
		
		
	}

}
