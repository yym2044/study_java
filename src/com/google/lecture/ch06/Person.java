//final

//field에만 사용된다
//프로그램 실행 동안 초기값 할당 후 변경 불가
//객체마다 존재
//초기화 방법1: 선언과 동시에 초기화
//초기화 방법2: 생성자를 이용하여 초기화
//초기화 시키지 않으면 컴파일 오류 발생

package com.google.lecture.ch06;

public class Person {

	final String nation = "Korea";	// 초기화 방법 1: 변수 생성시 초기화
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {		// 초기화 방법 2: 생성자 이용
		this.ssn = ssn;
		this.name = name;
	}
}
