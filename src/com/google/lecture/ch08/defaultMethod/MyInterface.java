package com.google.lecture.ch08.defaultMethod;

public interface MyInterface {
	void method1();		// public abstract 생략
	
	default void method2() {	// default method는 함수에 내용 적어야함
		System.out.println("MyInterface-method2() 실행");
	}
}
