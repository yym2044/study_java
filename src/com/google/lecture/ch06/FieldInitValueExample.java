package com.google.lecture.ch06;

public class FieldInitValueExample {

	public static void main(String[] args) {
		
//		초기화 안하고 선언만 했을 경우 초기값
		
		FieldInitValue fiv = new FieldInitValue();
		
		System.out.println("byteField = " + fiv.byteField);
		System.out.println("shortField = " + fiv.shortField);
		System.out.println("intField = " + fiv.intField);
		System.out.println("longField = " + fiv.longField);
		
		System.out.println();
		
		System.out.println("booleanField = " + fiv.booleanField);
		System.out.println("charField = " + fiv.charField);
		
		System.out.println();
		
		System.out.println("floatField = " + fiv.floatField);
		System.out.println("doubleField = " + fiv.doubleField);
		
		System.out.println();
		
		System.out.println("arrField = " + fiv.arrField);
		System.out.println("referenceField = " + fiv.referenceField);
		
	}

}
