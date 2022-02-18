package com.google.lecture.ch06;

public class Car {

	String company = "현대자동차";
	String model = "그랜다이져";
	String color = "화이트";
	int maxSpeed = 300;
	int speed = 0;
	
	public void speedUp(int a) {
		speed += a;
	}
	
	public void speedTest() {
		
		int speed = this.speed;
		int maxSpeed = this.maxSpeed;
		
		if(speed > maxSpeed) {
			System.out.println("과속입니다.");
		} else {
			System.out.println("정상입니다.");
		}
		
	}
}
