package com.google.lecture.ch10.exceptionHandling;

public class ThrowExample {

	public static void main(String[] args) throws ClassNotFoundException {

			findClass();
		
	}

	public static void findClass() throws ClassNotFoundException {
		
		Class clazz = Class.forName("java.lang.String2");
		
	}
}	

