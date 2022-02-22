package com.google.lecture.ch06;

public class ThirdCar {

	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
//	생성자 this()
//	생성자에서 다른 생성자 호출할 때 사용
//	다른 생성자 호출 시 첫줄에서만 사용 가능
	
	ThirdCar(){							//	이거랑 같은거
		this("아반떼","흰색",200);			//	ThirdCar() {
	}									//		this.model = "아반떼";
										//		this.color = "흰색";
										//		this.maxSpeed = 200;
										//	}

	ThirdCar(String model){
		this(model, "검정색", 300);			// 3번째 생성자를 호출
	}
	
	ThirdCar(String model, String color){ 
		this(model, color, 0);				// 3번째 생성자를 호출
	}
	
	ThirdCar(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
