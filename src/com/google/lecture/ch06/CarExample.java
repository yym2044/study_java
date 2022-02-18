package com.google.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
//		객체 접근 연산자를 사용하여 car 객체변수의 값을 참조
		
		System.out.println("company: " + car.company);
		System.out.println("model: " + car.model);
		System.out.println("color: " + car.color);
		System.out.println("maxSpeed: " + car.maxSpeed);
		System.out.println("speed: " + car.speed);
		
		car.speed = 100;
		
		System.out.println("speed: " + car.speed);
		
		car.speedUp(100);
		
		System.out.println("speed: " + car.speed);
		
		car.speedTest();
		
		car.speedUp(1000);
		
		car.speedTest();
	}

}
