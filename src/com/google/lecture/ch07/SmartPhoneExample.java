package com.google.lecture.ch07;

public class SmartPhoneExample {

	public static void main(String[] args) {

//		Phone phone = new Phone();	//추상클래스 객체 생성 불가
		
		SmartPhone smartPhone = new SmartPhone("yym");
		
		smartPhone.internetSearch();
		smartPhone.turnOff();
		smartPhone.turnOn();
		
	}

}
