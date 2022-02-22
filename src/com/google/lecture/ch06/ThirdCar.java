package com.google.lecture.ch06;

public class ThirdCar {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
//	생성자
	ThirdCar(){
		
	}

	ThirdCar(String model){
		this(model, null, 0);			// 3번째 생성자를 호출
	}
	
	ThirdCar(String model, String color){ 
		this(model, color, 0);			// 3번째 생성자를 호출
	}
	
	ThirdCar(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
