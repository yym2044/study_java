package com.google.lecture.ch08.defaultMethod;

public class DefaultMethodExample {

	public static void main(String[] args) {
		
		MyInterface myInterface = new MyClassA();
		
		myInterface.method1();
		
		MyInterface myInterface2 = new MyClassB();
		
		myInterface2.method1();
	}
}
